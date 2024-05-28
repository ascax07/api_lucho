package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.avion;



@Repository
    public interface IAvionRepository  extends CrudRepository<avion, Integer>{
	 
	@Query("SELECT a FROM avion a JOIN a.base b")
	    List<avion> findAllWithBase();
	    
	    
}
