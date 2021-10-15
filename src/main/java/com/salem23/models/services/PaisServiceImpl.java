package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisServiceImpl implements PaisService {
	@Autowired	
	PaisRepository paisRepository;	
		
	@Override
	public Optional<Pais> findById(Integer id){
		return paisRepository.findById(id);
	}
	@Override
	public List<Pais> findAll(){
		return paisRepository.findAll();
	}
	@Override
	public Pais save(Pais user) {
		return paisRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		paisRepository.deleteById(id);
	}
	
}
