/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public interface OperacoesDAO {

    void inserir (Object obj);
     
    boolean excluir (Object obj);
     
    void editar (Object obj);
     
    ArrayList pequisar();    
    
}
