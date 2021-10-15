package com.salem23.models.services;

import com.salem23.models.entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
	public Optional<Usuarios> findById(Integer id);
	public Optional<Usuarios> findByUserName(String username);
	public List<Usuarios> findAll();
	public Usuarios save(Usuarios user);
	public void DeleteById(Integer id);
}
