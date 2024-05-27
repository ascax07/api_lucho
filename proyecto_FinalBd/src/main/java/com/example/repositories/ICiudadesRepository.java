package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.ciudades;




    @Repository
    public interface ICiudadesRepository  extends CrudRepository<ciudades, Integer>{
    
}
