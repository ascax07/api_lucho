package com.example.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.models.ciudades;



public interface ICiudadesService {
    List<ciudades> findAll();

    Optional<ciudades> findById(Integer id);

    ciudades save(ciudades ciudades);

    Boolean delete(Integer id);
}



