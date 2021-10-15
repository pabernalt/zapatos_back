package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface MarcaService {
	public Optional<Marca> findById(Integer id);
	public List<Marca> findAll();
	public Marca save(Marca marca);
	public void DeleteById(Integer id);
}
