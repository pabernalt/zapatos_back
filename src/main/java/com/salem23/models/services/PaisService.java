package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface PaisService {
	public Optional<Pais> findById(Integer id);
	public List<Pais> findAll();
	public Pais save(Pais user);
	public void DeleteById(Integer id);
}
