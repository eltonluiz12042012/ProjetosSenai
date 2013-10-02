
package com.br.controle.model;

import java.util.Date;


public class SS {
    protected long id_ss;
    private String descricao;
    private Usuario usuario;
    private Colaborador colaborador;
    private String status;
    private Date dt_abertura;
    private Date dt_encerramento;
    private Modulo modulo;
    private int chamado;

    public SS() {
    }

    public SS(long id_ss, String descricao, Usuario usuario, Colaborador colaborador, String status, Date dt_abertura, Date dt_encerramento, Modulo modulo, int chamado) {
        this.id_ss = id_ss;
        this.descricao = descricao;
        this.usuario = usuario;
        this.colaborador = colaborador;
        this.status = status;
        this.dt_abertura = dt_abertura;
        this.dt_encerramento = dt_encerramento;
        this.modulo = modulo;
        this.chamado = chamado;
    }

    public long getId_ss() {
        return id_ss;
    }

    public void setId_ss(long id_ss) {
        this.id_ss = id_ss;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(Date dt_abertura) {
        this.dt_abertura = dt_abertura;
    }

    public Date getDt_encerramento() {
        return dt_encerramento;
    }

    public void setDt_encerramento(Date dt_encerramento) {
        this.dt_encerramento = dt_encerramento;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public int getChamado() {
        return chamado;
    }

    public void setChamado(int chamado) {
        this.chamado = chamado;
    }
}
