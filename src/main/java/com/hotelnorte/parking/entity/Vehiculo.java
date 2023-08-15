package com.hotelnorte.parking.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String marca;

    private String placa;
    private String modelo;
    private String color;

    public Vehiculo (){}

    public Vehiculo(Long id, String tipo,String marca, String placa, String modelo, String color) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
