package com.hotelnorte.parking.entity;

import javax.persistence.*;

@Entity
@Table(name = "autorizaciones")
public class Autorizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String area;

    @ManyToOne
    private Cliente clienteAutorizado;

    public Autorizacion() { }


    public Autorizacion(Long id, String area, Cliente clienteAutorizado) {
        this.id = id;
        this.area = area;
        this.clienteAutorizado = clienteAutorizado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Cliente getClienteAutorizado() {
        return clienteAutorizado;
    }

    public void setClienteAutorizado(Cliente clienteAutorizado) {
        this.clienteAutorizado = clienteAutorizado;
    }
}
