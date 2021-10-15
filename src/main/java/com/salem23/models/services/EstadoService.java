package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface EstadoService {
	public Optional<Estado> findById(Integer id);
	public List<Estado> findAll();
	public Estado save(Estado user);
	public void DeleteById(Integer id);
}
