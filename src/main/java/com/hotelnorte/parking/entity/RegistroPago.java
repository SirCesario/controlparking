package com.hotelnorte.parking.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "registrosPagos")
public class RegistroPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Estacionamiento estacionamiento;

    @ManyToOne
    private Tarifa tarifaAplicada;

    private LocalDateTime horaPago;
    private BigDecimal totalPagar;

    public RegistroPago() {}

    public RegistroPago(Long id, Estacionamiento estacionamiento, Tarifa tarifaAplicada, LocalDateTime horaPago, BigDecimal totalPagar) {
        this.id = id;
        this.estacionamiento = estacionamiento;
        this.tarifaAplicada = tarifaAplicada;
        this.horaPago = horaPago;
        this.totalPagar = totalPagar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Tarifa getTarifaAplicada() {
        return tarifaAplicada;
    }

    public void setTarifaAplicada(Tarifa tarifaAplicada) {
        this.tarifaAplicada = tarifaAplicada;
    }

    public LocalDateTime getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(LocalDateTime horaPago) {
        this.horaPago = horaPago;
    }

    public BigDecimal getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(BigDecimal totalPagar) {
        this.totalPagar = totalPagar;
    }
}
