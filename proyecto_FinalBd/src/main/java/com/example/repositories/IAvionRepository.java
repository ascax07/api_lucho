package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.avion;



@Repository
    public interface IAvionRepository  extends CrudRepository<avion, Integer>{
    
}
