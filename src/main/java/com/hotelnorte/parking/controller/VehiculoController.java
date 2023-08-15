package com.hotelnorte.parking.controller;

import com.hotelnorte.parking.entity.Vehiculo;
import com.hotelnorte.parking.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    @Autowired
    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @PostMapping
    public ResponseEntity<Vehiculo> registrarVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo nuevoVehiculo = vehiculoService.registrarVehiculo(vehiculo);
        return new ResponseEntity<>(nuevoVehiculo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> obtenerVehiculoPorId(@PathVariable Long id) {
        Vehiculo vehiculo = vehiculoService.obtenerVehiculoPorId(id);
        return ResponseEntity.ok(vehiculo);
    }

    @GetMapping
    public ResponseEntity<List<Vehiculo>> obtenerTodosLosVehiculos() {
        List<Vehiculo> vehiculos = vehiculoService.obtenerTodosLosVehiculos();
        return ResponseEntity.ok(vehiculos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> actualizarVehiculo(@PathVariable Long id, @RequestBody Vehiculo vehiculoActualizado) {
        Vehiculo vehiculoActualizadoResult = vehiculoService.actualizarVehiculo(id, vehiculoActualizado);
        return ResponseEntity.ok(vehiculoActualizadoResult);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVehiculo(@PathVariable Long id) {
        vehiculoService.eliminarVehiculoPorId(id);
        return ResponseEntity.noContent().build();
    }
}
