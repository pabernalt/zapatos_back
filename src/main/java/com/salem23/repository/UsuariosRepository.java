package com.salem23.repository;

import com.salem23.models.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios, Integer> {
	Optional<Usuarios> findByUsername(String username);
	
	}

