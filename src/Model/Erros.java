/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;



/**
 *
 * @author Fernando
 */
public class Erros implements Serializable {
        private String codigo;
        private String nome;
        private String desc;
        private int prioridade;
    
    
    public Erros (String codigo, String nome, String desc, int prioridade){
        this.codigo = codigo;
        this.nome = nome;
        this.desc = desc;
        this.prioridade = prioridade;
    }

    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the prioridade
     */
    public int getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    @Override
    public String toString(){
        return "Erro{" + "Nome=" + nome + ", Descrição=" + desc +", Prioridade=" + prioridade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.codigo != "" ? this.codigo.hashCode() : 0);
        return hash;
    }
    




}
    
    