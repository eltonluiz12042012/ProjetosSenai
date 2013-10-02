
package com.br.controle.model;


public class Modulo {
    
    private int id_modulo;
    private String descricao;
    private Sistema sistema;

    public Modulo() {
    }

    public Modulo(int id_modulo, String descricao, Sistema sistema) {
        this.id_modulo = id_modulo;
        this.descricao = descricao;
        this.sistema = sistema;
    }

    public int getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
}


