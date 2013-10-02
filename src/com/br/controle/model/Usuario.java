
package com.br.controle.model;

import java.util.Date;


public class Usuario extends Pessoa {

    private String user;
    private Date dt_cadastro;
    private boolean ativo;
    private String senha;

    public Usuario() {
    }

    public Usuario(String user, Date dt_cadastro, boolean ativo, String senha) {
        this.user = user;
        this.dt_cadastro = dt_cadastro;
        this.ativo = ativo;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
