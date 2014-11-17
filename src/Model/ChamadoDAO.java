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
public class ChamadoDAO implements OperacoesDAO {
    
    private HashMap<String, Chamado> chamados = new HashMap();
 
    public ChamadoDAO() {
        if (chamados.isEmpty()) {
            Object obj = GerenciadorArquivos.lerDadosChamados("chamados.dat");
            if (obj instanceof HashMap) {
                chamados = (HashMap) obj;
            }
        }
    }
    
    @Override
    public void inserir(Object obj) {
        if (obj instanceof Chamado) {
            Chamado cham = (Chamado) obj;
            String chave = cham.getCodigo();
            chamados.put(chave, cham);
        }
    }
    
    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof String) {
            String chave = (String) obj;
            Chamado cham = chamados.remove(chave);
            if (cham != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void editar(Object obj) {
        if (obj instanceof Chamado) {
            Chamado novo = (Chamado) obj; // Com os dados a serem alterados
            String chave = novo.getCodigo();
            chamados.put(chave, novo);
        }
    }

@Override
    public ArrayList pequisar() {
        Collection<Chamado> lista = chamados.values();
        ArrayList retorno = new ArrayList(lista);
        return retorno;
    }
    
public Chamado pesquisar(String chave) {
        Chamado cham = chamados.get(chave);
        return cham;
        // Se não encontrar a chave retorna null;
    }
 
//    public Usuario pesquisar(String login, String senha) {
//        Collection<Usuario> lista = usuarios.values();
//        Iterator<Usuario> it = lista.iterator();
//        while (it.hasNext()) {
//            Usuario user = it.next();
//            if ((user.getLogin().equals(login))
//                    && (user.getSenha().equals(senha))) {
//                return user;
//            }
//        }
//        return null;
//    }
    
    public void finalizar(){
        GerenciadorArquivos.gravarDadosChamados("chamados.dat", chamados);
    }
    
    
    
}
