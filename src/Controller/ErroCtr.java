/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Erros;
import Model.ErrosDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Fernando
 */
public class ErroCtr {
    
       public void carregarErros(JComboBox comboErros){
        ArrayList err = new ErrosDAO().pequisar();
        DefaultComboBoxModel ComboBox1 =(DefaultComboBoxModel) comboErros.getModel();
        ComboBox1.removeAllElements();
        List<Erros> erros = new ArrayList<Erros>();
        
        Vector vetor = new Vector();
        Collection<Erros> lista = err;
        Iterator<Erros> it = lista.iterator();
        while (it.hasNext()) {
            Erros error = it.next();
            ComboBox1.addElement(error.getNome());                
        }
    }
    
}
