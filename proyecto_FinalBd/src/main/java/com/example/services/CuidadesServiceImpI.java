package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceService.ICiudadesService;
import com.example.models.ciudades;
import com.example.repositories.ICiudadesRepository;



    @Service
public class CuidadesServiceImpI   implements  ICiudadesService{
    @Autowired
    ICiudadesRepository repository;

    @Override
    public List<ciudades> findAll() {
        return (List<ciudades>) repository.findAll();
    }

    @Override
    public Optional<ciudades> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ciudades save(ciudades ciudades) {
        return repository.save(ciudades);
    }

    @Override
    public Boolean delete(Integer id) {
        try{
            repository.deleteById(id);
            return true;
        }
        catch(Exception ex){
            return false;
        }    
    }

}
