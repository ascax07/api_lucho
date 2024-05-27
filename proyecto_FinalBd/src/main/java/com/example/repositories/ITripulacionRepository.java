package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.tripulacion;


    @Repository
public interface ITripulacionRepository  extends CrudRepository<tripulacion, Integer>{
}
