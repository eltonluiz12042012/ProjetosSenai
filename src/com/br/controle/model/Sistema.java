
package com.br.controle.model;

public class Sistema {

    private int id_sistema;
    private String descricao;

    public Sistema() {
    }

    public Sistema(int id_sistema, String descricao) {
        this.id_sistema = id_sistema;
        this.descricao = descricao;
    }

    public int getId_sistema() {
        return id_sistema;
    }

    public void setId_sistema(int id_sistema) {
        this.id_sistema = id_sistema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
