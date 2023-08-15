package com.hotelnorte.parking.service;

import com.hotelnorte.parking.entity.Vehiculo;

import java.util.List;

public interface VehiculoService {

       Vehiculo registrarVehiculo(Vehiculo vehiculo);

        Vehiculo obtenerVehiculoPorId(Long id);

        List<Vehiculo> obtenerTodosLosVehiculos();

        Vehiculo actualizarVehiculo(Long id, Vehiculo vehiculoActualizado);

        void eliminarVehiculoPorId(Long id);


}
