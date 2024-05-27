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

import com.example.InterfaceService.IBaseService;
import com.example.models.base;




@RestController
@RequestMapping("/api/base")
public class baseController {
    @Autowired
    IBaseService service;

    @GetMapping("/getAll")
    public List<base> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<base> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public base create(@RequestBody base base) {
        return service.save(base);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return service.delete(id);
    }
    
}