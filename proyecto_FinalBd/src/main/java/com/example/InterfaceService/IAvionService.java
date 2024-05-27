package com.example.InterfaceService;


import java.util.List;
import java.util.Optional;

import com.example.models.avion;



    public interface IAvionService {
    List<avion> findAll();

    Optional<avion> findById(Integer id);

    avion save(avion avion);

    Boolean delete(Integer id);
}


