package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface LineaZapatoService {
	public Optional<LineaZapato> findById(Integer id);
	public List<LineaZapato> findAll();
	public LineaZapato save(LineaZapato user);
	public void DeleteById(Integer id);
}
