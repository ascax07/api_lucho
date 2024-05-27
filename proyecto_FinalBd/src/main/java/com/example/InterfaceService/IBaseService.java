package com.example.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.models.base;

public interface IBaseService {
    List<base> findAll();

    Optional<base> findById(Integer id);

    base save(base base);

    Boolean delete(Integer id);

}