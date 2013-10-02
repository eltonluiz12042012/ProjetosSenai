

package com.br.controle.model;

import java.util.Date;

public class Colaborador extends Pessoa {
	
    private int ramal;
    private Date dt_admissao;
    private Date dt_demissão;
    private Setor setor;

    public Colaborador() {
    }

    public Colaborador(int ramal, Date dt_admissao, Date dt_demissão, Setor setor) {
        this.ramal = ramal;
        this.dt_admissao = dt_admissao;
        this.dt_demissão = dt_demissão;
        this.setor = setor;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public Date getDt_admissao() {
        return dt_admissao;
    }

    public void setDt_admissao(Date dt_admissao) {
        this.dt_admissao = dt_admissao;
    }

    public Date getDt_demissão() {
        return dt_demissão;
    }

    public void setDt_demissão(Date dt_demissão) {
        this.dt_demissão = dt_demissão;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
  
}