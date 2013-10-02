
package com.br.controle.model;


public class Usuario_Modulo {
    
    private int id;
    private Usuario usuario;
    private Modulo modulo;

    public Usuario_Modulo(int id, Usuario usuario, Modulo modulo) {
        this.id = id;
        this.usuario = usuario;
        this.modulo = modulo;
    }

    public Usuario_Modulo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
