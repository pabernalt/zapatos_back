package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface TipoZapatoService {
	public Optional<TipoZapato> findById(Integer id);
	public List<TipoZapato> findAll();
	public TipoZapato save(TipoZapato tipo);
	public void DeleteById(Integer id);
}
