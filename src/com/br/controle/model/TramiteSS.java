
package com.br.controle.model;

import java.util.Date;


public class TramiteSS {
    
    private long id_ss;
    private int sequencia_ss;
    private Date dt_tramite;
    private String status;
    private String descricao;
    private Usuario usuario;

    public TramiteSS() {
    }

    public TramiteSS(long id_ss, int sequencia_ss, Date dt_tramite, String status, String descricao, Usuario usuario) {
        this.id_ss = id_ss;
        this.sequencia_ss = sequencia_ss;
        this.dt_tramite = dt_tramite;
        this.status = status;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public long getId_ss() {
        return id_ss;
    }

    public void setId_ss(long id_ss) {
        this.id_ss = id_ss;
    }

    public int getSequencia_ss() {
        return sequencia_ss;
    }

    public void setSequencia_ss(int sequencia_ss) {
        this.sequencia_ss = sequencia_ss;
    }

    public Date getDt_tramite() {
        return dt_tramite;
    }

    public void setDt_tramite(Date dt_tramite) {
        this.dt_tramite = dt_tramite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
