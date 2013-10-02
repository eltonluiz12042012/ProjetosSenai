
package com.br.controle.model;


public class Responsavel extends Pessoa{

    private int ramal;
    private String email;


    public Responsavel() {
        
    }

    public Responsavel(int ramal, String email) {
        this.ramal = ramal;
        this.email = email;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
