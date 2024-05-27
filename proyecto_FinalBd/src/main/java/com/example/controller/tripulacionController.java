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

import com.example.InterfaceService.ITripulacionService;
import com.example.models.tripulacion;




@RestController
@RequestMapping("/api/tripulacion")
public class tripulacionController {
    @Autowired
    ITripulacionService service;

    @GetMapping("/getAll")
    public List<tripulacion> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<tripulacion> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public tripulacion create(@RequestBody tripulacion tripulacion) {
        return service.save(tripulacion);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return service.delete(id);
    }
    
}
