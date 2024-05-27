package com.example.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.models.piloto;



public interface IPilotoService {
    List<piloto> findAll();

    Optional<piloto> findById(Integer id);

    piloto save(piloto piloto);

    Boolean delete(Integer id);
}



