package com.br.controle.model;



public class Cidade {
    
    private int id_cidade;
    private String descricao;
    private char uf;

    public Cidade() {
    }

    public Cidade(int id_cidade, String descricao, char uf) {
        this.id_cidade = id_cidade;
        this.descricao = descricao;
        this.uf = uf;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getUf() {
        return uf;
    }

    public void setUf(char uf) {
        this.uf = uf;
    }
    
}