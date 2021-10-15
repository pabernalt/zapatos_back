package com.salem23.repository;

import com.salem23.models.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository <Pais, Integer> {

	
	}

