package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.base;


@Repository
public interface IBaseRepository  extends CrudRepository<base, Integer>{

}
