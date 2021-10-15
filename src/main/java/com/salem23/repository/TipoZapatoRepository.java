package com.salem23.repository;

import com.salem23.models.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoZapatoRepository extends JpaRepository <TipoZapato, Integer> {

	
	}

