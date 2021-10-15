package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface ZapatosService {
	public Optional<Zapatos> findById(Integer id);
	public List<Zapatos> findAll();
	public Zapatos save(Zapatos user);
	public void DeleteById(Integer id);
}
