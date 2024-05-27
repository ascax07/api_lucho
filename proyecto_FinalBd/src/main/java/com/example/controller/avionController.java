package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterfaceService.IAvionService;
import com.example.models.avion;



    @RestController
@RequestMapping("/api/avion")
public class avionController {
    @Autowired
    IAvionService service;

    @GetMapping("/getAll")
    public List<avion> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<avion> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public avion create(@RequestBody avion avion) {
        return service.save(avion);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return service.delete(id);
    }
    
}


