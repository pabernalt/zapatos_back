package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZapatosServiceImpl implements ZapatosService {
	@Autowired	
	ZapatosRepository zRepository;	
		
	@Override
	public Optional<Zapatos> findById(Integer id){
		return zRepository.findById(id);
	}
	@Override
	public List<Zapatos> findAll(){
		return zRepository.findAll();
	}
	@Override
	public Zapatos save(Zapatos user) {
		return zRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		zRepository.deleteById(id);
	}
	
}
