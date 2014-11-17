/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Util.GerenciadorArquivos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class UsuarioDAO implements OperacoesDAO {
    
    private HashMap<String, Usuario> usuarios = new HashMap();
 
    public UsuarioDAO() {
        if (usuarios.isEmpty()) {
            Object obj = GerenciadorArquivos.lerDados("usuarios.dat");
            if (obj instanceof HashMap) {
                usuarios = (HashMap) obj;
            }
        }
    }
    
    @Override
    public void inserir(Object obj) {
        if (obj instanceof Usuario) {
            Usuario user = (Usuario) obj;
            String chave = user.getMatricula();
            usuarios.put(chave, user);
        }
    }
    
    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof String) {
            String chave = (String) obj;
            Usuario user = usuarios.remove(chave);
            if (user != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void editar(Object obj) {
        if (obj instanceof Usuario) {
            Usuario novo = (Usuario) obj; // Com os dados a serem alterados
            String chave = novo.getMatricula();
            usuarios.put(chave, novo);
        }
    }

@Override
    public ArrayList pequisar() {
        Collection<Usuario> lista = usuarios.values();
        ArrayList retorno = new ArrayList(lista);
        return retorno;
    }
    
//@Override
    public ArrayList pequisarNome() {
        ArrayList retorno = new ArrayList();
        Collection<Usuario> lista = usuarios.values();
        Iterator<Usuario> it = lista.iterator();
        while (it.hasNext()) {
            Usuario user = it.next();
            if (user.getTipo() == 1)
                retorno.add(user.getNome());
        }
        return retorno;
    }
    
public Usuario pesquisar(String chave) {
        Usuario user = usuarios.get(chave);
        return user;
        // Se não encontrar a chave retorna null;
    }
 
    public Usuario pesquisar(String login, String senha) {
        Collection<Usuario> lista = usuarios.values();
        Iterator<Usuario> it = lista.iterator();
        while (it.hasNext()) {
            Usuario user = it.next();
            if ((user.getLogin().equals(login))
                    && (user.getSenha().equals(senha))) {
                return user;
            }
        }
        return null;
    }
    
    public void finalizar(){
        GerenciadorArquivos.gravarDados("usuarios.dat", usuarios);
    }
    
    
    
}
