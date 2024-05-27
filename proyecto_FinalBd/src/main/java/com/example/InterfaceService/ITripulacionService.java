package com.example.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.models.tripulacion;

public interface ITripulacionService {
    List<tripulacion> findAll();

    Optional<tripulacion> findById(Integer id);

    tripulacion save(tripulacion tripulacion);

    Boolean delete(Integer id);
}


