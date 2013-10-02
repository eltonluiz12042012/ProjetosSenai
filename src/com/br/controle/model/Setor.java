
package com.br.controle.model;

public class Setor{
    private int id_setor;
    private String descricao;
    private Loja loja;
    private Responsavel responsavel;

    public Setor() {
    }

    public Setor(int id_setor, String descricao, Loja loja, Responsavel responsavel) {
        this.id_setor = id_setor;
        this.descricao = descricao;
        this.loja = loja;
        this.responsavel = responsavel;
    }

    public int getId_setor() {
        return id_setor;
    }

    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
