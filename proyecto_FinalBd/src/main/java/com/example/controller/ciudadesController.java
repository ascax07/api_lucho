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

import com.example.InterfaceService.ICiudadesService;
import com.example.models.ciudades;


@RestController
@RequestMapping("/api/ciudades")
public class ciudadesController {
    @Autowired
    ICiudadesService service;

    @GetMapping("/getAll")
    public List<ciudades> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ciudades> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public ciudades create(@RequestBody ciudades ciudades) {
        return service.save(ciudades);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return service.delete(id);
    }
}
