package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoServiceImpl implements EstadoService {
	@Autowired	
	EstadoRepository estadoRepository;	
		
	@Override
	public Optional<Estado> findById(Integer id){
		return estadoRepository.findById(id);
	}
	@Override
	public List<Estado> findAll(){
		return estadoRepository.findAll();
	}
	@Override
	public Estado save(Estado user) {
		return estadoRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		estadoRepository.deleteById(id);
	}
	
}
