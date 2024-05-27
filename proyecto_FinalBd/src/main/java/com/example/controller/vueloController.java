package com.example.controller;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterfaceService.IVueloService;
import com.example.models.vuelo;





@RestController
@RequestMapping("/api/vuelo")
public class vueloController {
    @Autowired
    IVueloService service;

    @GetMapping("/getAll")
    public List<vuelo> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<vuelo> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public vuelo create(@RequestBody vuelo vuelo) {
        return service.save(vuelo);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return service.delete(id);
    }


    @GetMapping("/por-fechas")
    public ResponseEntity<List<vuelo>> getVuelosPorFechas(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
                                                          @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        List<vuelo> vuelos = service.obtenerVuelosPorRangoDeFechas(startDate, endDate);
        return ResponseEntity.ok(vuelos);
    }

    
}
