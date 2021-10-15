package com.salem23.repository;

import com.salem23.models.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {

	
	}

