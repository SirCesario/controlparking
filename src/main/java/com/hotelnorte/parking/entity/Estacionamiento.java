package com.hotelnorte.parking.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "estacionamientos")
public class Estacionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String tipo;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Vehiculo vehiculo;

    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public Estacionamiento() {}

    public Estacionamiento(Long id, String tipo, Cliente cliente, Vehiculo vehiculo, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.id = id;
        this.tipo = tipo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
