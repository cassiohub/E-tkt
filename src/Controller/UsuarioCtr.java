/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Usuario;
import Model.UsuarioDAO;
import Util.GerenciadorArquivos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class UsuarioCtr {
    
    public static HashMap LerArquivoUsuarios(){
        HashMap<String, Usuario> usuarios = new HashMap();
        Object obj = GerenciadorArquivos.lerDados("usuarios.dat");
        if (obj instanceof HashMap) {
            usuarios = (HashMap) obj;
        }
        return usuarios;
    }
    
    public static Usuario pesquisaUsuario(String usuario){
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList resultadoUsuarios = dao.pequisar();
        Collection<Usuario> lista = resultadoUsuarios;
        Iterator<Usuario> it = lista.iterator();
        while (it.hasNext()) {
            Usuario user = it.next();
            if (user.getNome().equals(usuario)){
                return user;
            }
        } 
        return null;
    }
    
    public static void LerArqUsuarios(){
        HashMap<String, Usuario> usuarios = new HashMap();
        Object obj = GerenciadorArquivos.lerDados("usuarios.dat");
        if (obj instanceof HashMap) {
            usuarios = (HashMap) obj;
        }
    }
    
}
