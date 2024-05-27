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

import com.example.InterfaceService.IPilotoService;
import com.example.models.piloto;



@RestController
@RequestMapping("/api/piloto")
public class pilotoController {
    @Autowired
    IPilotoService service;

    @GetMapping("/getAll")
    public List<piloto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<piloto> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public piloto create(@RequestBody piloto piloto) {
        return service.save(piloto);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return service.delete(id);
    }
    
}
