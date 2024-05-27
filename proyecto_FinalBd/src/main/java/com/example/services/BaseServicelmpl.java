package com.example.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceService.IBaseService;
import com.example.models.base;
import com.example.repositories.IBaseRepository;


@Service
public class BaseServicelmpl  implements  IBaseService{
    @Autowired
    IBaseRepository repository;

    @Override
    public List<base> findAll() {
        return (List<base>) repository.findAll();
    }

    @Override
    public Optional<base> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public base save(base base) {
        return repository.save(base);
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

