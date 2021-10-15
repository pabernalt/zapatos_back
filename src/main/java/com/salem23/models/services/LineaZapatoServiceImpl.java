package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LineaZapatoServiceImpl implements LineaZapatoService {
	@Autowired	
	LineaZapatoRepository lZcolorRepository;	
		
	@Override
	public Optional<LineaZapato> findById(Integer id){
		return lZcolorRepository.findById(id);
	}
	@Override
	public List<LineaZapato> findAll(){
		return lZcolorRepository.findAll();
	}
	@Override
	public LineaZapato save(LineaZapato user) {
		return lZcolorRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		lZcolorRepository.deleteById(id);
	}
	
}
