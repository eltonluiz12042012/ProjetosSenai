
package com.br.controle.model;

public class Loja {

    private int id_loja;
    private String descricao;
    private Cidade cidade;
    private String cnpj;

    public Loja() {
    }

    public Loja(int id_loja, String descricao, Cidade cidade, String cnpj) {
        this.id_loja = id_loja;
        this.descricao = descricao;
        this.cidade = cidade;
        this.cnpj = cnpj;
    }

    public int getId_loja() {
        return id_loja;
    }

    public void setId_loja(int id_loja) {
        this.id_loja = id_loja;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}