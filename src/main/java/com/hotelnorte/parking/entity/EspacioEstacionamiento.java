package com.hotelnorte.parking.entity;

import javax.persistence.*;

@Entity
@Table(name = "espaciosEstacionamiento")
public class EspacioEstacionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String estado;

    public EspacioEstacionamiento (){};

    public EspacioEstacionamiento(Long id, String tipo, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
