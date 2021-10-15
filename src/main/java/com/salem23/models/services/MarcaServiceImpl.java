package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
	@Autowired	
	MarcaRepository marcaRepository;	
		
	@Override
	public Optional<Marca> findById(Integer id){
		return marcaRepository.findById(id);
	}
	@Override
	public List<Marca> findAll(){
		return marcaRepository.findAll();
	}
	@Override
	public Marca save(Marca user) {
		return marcaRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		marcaRepository.deleteById(id);
	}
	
}
