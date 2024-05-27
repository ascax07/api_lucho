package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceService.IPilotoService;
import com.example.models.piloto;
import com.example.repositories.IPilotoRepository;



@Service
public class PilotoServiceImpl  implements IPilotoService{
    @Autowired
    IPilotoRepository repository;

    @Override
    public List<piloto> findAll() {
        return (List<piloto>) repository.findAll();
    }

    @Override
    public Optional<piloto> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public piloto save(piloto piloto) {
        return repository.save(piloto);
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