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
public class ErrosDAO implements OperacoesDAO {
    
    private HashMap<String, Erros> erro = new HashMap();
    
    public ErrosDAO() {
        if (erro.isEmpty()) {
            Object obj = GerenciadorArquivos.lerDados("erros.dat");
            if (obj instanceof HashMap) {
                erro = (HashMap) obj;
            }
        }
    }
    
    @Override
    public void inserir(Object obj) {
        if (obj instanceof Erros) {
            Erros error = (Erros) obj;
            String chave = error.getCodigo();
            erro.put(chave, error);
        }
    }
    
    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof String) {
            String chave = (String) obj;
            Erros error = erro.remove(chave);
            if (error != null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void editar(Object obj) {
        if (obj instanceof Usuario) {
            Erros error = (Erros) obj; // Com os dados a serem alterados
            String chave = error.getCodigo();
            erro.put(chave, error);
        }
    }
    
    @Override
    public ArrayList pequisar() {
        Collection<Erros> lista = erro.values();
        ArrayList retorno = new ArrayList(lista);
        return retorno;
    }
    
    public Erros pesquisar(String chave) {
        Erros error = erro.get(chave);
        return error;
        // Se não encontrar a chave retorna null;
    }
    
    public void finalizar(){
        GerenciadorArquivos.gravarDados("erros.dat", erro);
    }
    
    
}
