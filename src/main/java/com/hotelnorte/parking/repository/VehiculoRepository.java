package com.hotelnorte.parking.repository;

import com.hotelnorte.parking.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

    List<Vehiculo> findByTipo(String tipo);

    List<Vehiculo> findByPlaca(String placa);

    @Query("SELECT v FROM Vehiculo v WHERE v.color = :color")
    List<Vehiculo> findByColor(@Param("color") String color);
}