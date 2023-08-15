package com.hotelnorte.parking.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tarifas")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    private BigDecimal valorPorMinuto;
    private BigDecimal valorPleno;
    private BigDecimal descuento;

    public Tarifa() {}

    public Tarifa(Long id, String tipo, BigDecimal valorPorMinuto, BigDecimal valorPleno, BigDecimal descuento) {
        this.id = id;
        this.tipo = tipo;
        this.valorPorMinuto = valorPorMinuto;
        this.valorPleno = valorPleno;
        this.descuento = descuento;
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

    public BigDecimal getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(BigDecimal valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }

    public BigDecimal getValorPleno() {
        return valorPleno;
    }

    public void setValorPleno(BigDecimal valorPleno) {
        this.valorPleno = valorPleno;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
}
