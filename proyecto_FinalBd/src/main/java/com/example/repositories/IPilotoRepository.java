package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.piloto;



@Repository
public interface IPilotoRepository  extends CrudRepository<piloto, Integer>{

}
