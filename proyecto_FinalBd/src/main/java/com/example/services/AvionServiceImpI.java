package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceService.IAvionService;
import com.example.models.avion;
import com.example.repositories.IAvionRepository;



@Service
public class AvionServiceImpI implements  IAvionService{
    @Autowired
    IAvionRepository repository;

    @Override
    public List<avion> findAll() {
        return (List<avion>) repository.findAll();
    }

    @Override
    public Optional<avion> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public avion save(avion avion) {
        return repository.save(avion);
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
    
    @Override
    public List<avion> findAllWithBase() {
        return repository.findAllWithBase();
    }

}
