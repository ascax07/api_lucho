package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceService.ITripulacionService;
import com.example.models.tripulacion;
import com.example.repositories.ITripulacionRepository;





@Service
public class TripulacionServicelmpl  implements ITripulacionService{
    @Autowired
    ITripulacionRepository repository;

    @Override
    public List<tripulacion> findAll() {
        return (List<tripulacion>) repository.findAll();
    }

    @Override
    public Optional<tripulacion> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public tripulacion save(tripulacion tripulacion) {
        return repository.save(tripulacion);
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
