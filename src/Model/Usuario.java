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
public class Usuario implements Serializable, Comparable  {
    private String nome;
    private String email;
    private String tel;
    private String mat;
    private Departamento depto;
    private String senha;
    private String login;
    private int tipo;
    //private TypeUser tipoUsuario;

    public Usuario(String nome, String email, String tel, String mat, String senha, String login, int tipo) {
        this.nome = nome;
        this.email = email;
        this.tel = tel;
        this.mat = mat;
        this.senha = senha;
        this.login = login;
        this.tipo = tipo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

        /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
        /**
     * @return the telefone
     */
    public String getTelefone() {
        return tel;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String tel) {
        this.tel = tel;
    }
    
        /**
     * @return the matricula
     */
    public String getMatricula() {
        return mat;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String mat) {
        this.mat = mat;
    }
    
        /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getLogin(){
        return login;
    }
    
    
    
    public void setLogin(String login){
        this.login = login;
    }


    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(){
        this.tipo = tipo;
    }
    
    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return depto;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento depto) {
        this.depto = depto;
    }



    /**
     * @return the tipoUsuario
     */
//    public TypeUser getTipoUsuario() {
//        return tipoUsuario;
//    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
//    public void setTipoUsuario(TypeUser tipoUsuario) {
//        this.tipoUsuario = tipoUsuario;
//    }
    
    
     @Override
    public String toString(){
        return "Usuario{" + "Nome=" + nome + ", Email=" + email +", Telefone=" + tel + ", Matricula=" + mat + ", Senha=" + senha + ", Login=" + login + ", Tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(Object o) {
        int retorno = 0;
        if((o != null) && (o instanceof Usuario)){
            Usuario u = (Usuario) o;
            retorno = this.getNome().compareTo(u.getNome());
        }
        return retorno;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.mat != null ? this.mat.hashCode() : 0);
        return hash;
    }
    
}    

