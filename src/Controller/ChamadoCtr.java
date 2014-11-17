/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.ChamadoDAO;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class ChamadoCtr {
    
        public void carregarChamados(JTextField texto){
        if (texto instanceof JTextField){
            ChamadoDAO dao = new ChamadoDAO();
            ArrayList resultadoChamados = dao.pequisar();
            
            int qt = resultadoChamados.size();
            qt = qt+1;

            texto.setText(Integer.toString(qt));
        }
        
        
    }
    
    
    
}
