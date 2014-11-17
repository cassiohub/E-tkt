/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class GerenciadorArquivos {

    public static void gravarDados(String arquivo, Object dados) {

        try {
            File f = new File(arquivo);
            if (!f.exists()) {
                JOptionPane.showMessageDialog(null, "Arquivo não existe e será criado");
                f.createNewFile();
            }
            JOptionPane.showMessageDialog(null, "Sucesso!");
            
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(dados);
            fout.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static Object lerDados(String arquivo) {
        Object retorno = null;
        try {
            File f = new File(arquivo);
            if (f.exists()) {
                //JOptionPane.showMessageDialog(null, "Arquivo já existe e será lido");
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream oin = new ObjectInputStream(fin);
                retorno = oin.readObject();
                fin.close();
            } else {
                JOptionPane.showMessageDialog(null, "AQUIArquivo não existe");
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        } finally {
            return retorno;
        }
    }
    
// ------------------  Arquivos de Erros ------------------------
    
    public static void gravarDadosErros(String arquivo, Object dados) {

        try {
            File f = new File(arquivo);
            if (!f.exists()) {
                JOptionPane.showMessageDialog(null, "Arquivo não existe e será criado");
                f.createNewFile();
            }
            JOptionPane.showMessageDialog(null, "Sucesso!");
            
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(dados);
            fout.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    
    public static Object lerDadosErros(String arquivo) {
        Object retorno = null;
        try {
            File f = new File(arquivo);
            if (f.exists()) {
                //JOptionPane.showMessageDialog(null, "Arquivo já existe e será lido");
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream oin = new ObjectInputStream(fin);
                retorno = oin.readObject();
                fin.close();
            } else {
                JOptionPane.showMessageDialog(null, "Arquivo não existe");
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        } finally {
            return retorno;
        }
    }
    
    
// ------------------  Arquivo de Chamados ------------------------
    
    public static void gravarDadosChamados(String arquivo, Object dados) {

        try {
            File f = new File(arquivo);
            if (!f.exists()) {
                JOptionPane.showMessageDialog(null, "Arquivo não existe e será criado");
                f.createNewFile();
            }
            JOptionPane.showMessageDialog(null, "Sucesso!");
            
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(dados);
            fout.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    
    public static Object lerDadosChamados(String arquivo) {
        Object retorno = null;
        try {
            File f = new File(arquivo);
            if (f.exists()) {
                //JOptionPane.showMessageDialog(null, "Arquivo já existe e será lido");
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream oin = new ObjectInputStream(fin);
                retorno = oin.readObject();
                fin.close();
            } else {
                JOptionPane.showMessageDialog(null, "Arquivo não existe");
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        } finally {
            return retorno;
        }
    }
    
    public static void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja fechar a aplicação?", "etkt", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (resp == 0) {
                System.exit(1);
            };
    }
    
    
}
