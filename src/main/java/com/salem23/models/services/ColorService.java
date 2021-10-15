package com.salem23.models.services;

import com.salem23.models.entity.*;

import java.util.List;
import java.util.Optional;

public interface ColorService {
	public Optional<Color> findById(Integer id);
	public List<Color> findAll();
	public Color save(Color user);
	public void DeleteById(Integer id);
}
