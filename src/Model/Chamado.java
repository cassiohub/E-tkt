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
public class Chamado implements Serializable, Comparable {  
    private String codigo;
    private Usuario usuario;
    private String descricao;
    private String dataAbertura;
    private String dataFechamento;
    private String status;
    private Erros erro;
    private String respAtend;
    //private TypeUser tipoUsuario;

    public Chamado(String codigo, String descricao, String dataAbertura, String dataFechamento, String status, String respAtend) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.status = status;
        this.respAtend = respAtend;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Erros getErro(){
        return erro;
    }
    
    public void setErro (Erros erro){
        this.erro = erro;
    }
    
    public String getRespAtend(){
        return respAtend;
    }
    
    public void setRespAtend(String respAtend){
        this.respAtend = respAtend;
    }
    
     @Override
    public String toString(){
        return "Chamado{" + "Código=" + codigo + ", Usuario=" + usuario +", Descrição=" + descricao + ", Data de Abertura=" + dataAbertura + ", Data de Fechamento=" + dataFechamento + ", Status=" + status + ", Erro=" + erro + ", Responsável=" + respAtend +  '}';
    }

    public int compareTo(Object o) {
        int retorno = 0;
        if((o != null) && (o instanceof Usuario)){
            Chamado u = (Chamado) o;
            retorno = this.getCodigo().compareTo(u.getCodigo());
        }
        return retorno;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.codigo != null ? this.codigo.hashCode() : 0);
        return hash;
    }
    
}    

