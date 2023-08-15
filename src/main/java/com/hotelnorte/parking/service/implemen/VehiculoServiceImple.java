package com.hotelnorte.parking.service.implemen;

import com.hotelnorte.parking.entity.Vehiculo;
import com.hotelnorte.parking.repository.VehiculoRepository;
import com.hotelnorte.parking.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;

@Service
public class VehiculoServiceImple implements VehiculoService {

    private VehiculoRepository vehiculoRepository;

    @Autowired
    public void VehiculoServiceImpl(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public Vehiculo registrarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(Long id) {
        return vehiculoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Vehículo no encontrado con ID: " + id));
    }

    @Override
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo actualizarVehiculo(Long id, Vehiculo vehiculoActualizado) {
        Vehiculo vehiculoExistente = obtenerVehiculoPorId(id);
        vehiculoExistente.setTipo(vehiculoActualizado.getTipo());
        vehiculoExistente.setPlaca(vehiculoActualizado.getPlaca());
        vehiculoExistente.setModelo(vehiculoActualizado.getModelo());
        vehiculoExistente.setColor(vehiculoActualizado.getColor());
        return vehiculoRepository.save(vehiculoExistente);
    }

    @Override
    public void eliminarVehiculoPorId(Long id) {
        Vehiculo vehiculo = obtenerVehiculoPorId(id);
        vehiculoRepository.delete(vehiculo);
    }

}
