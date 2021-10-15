package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImpl implements ColorService {
	@Autowired	
	ColorRepository colorRepository;	
		
	@Override
	public Optional<Color> findById(Integer id){
		return colorRepository.findById(id);
	}
	@Override
	public List<Color> findAll(){
		return colorRepository.findAll();
	}
	@Override
	public Color save(Color user) {
		return colorRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		colorRepository.deleteById(id);
	}
	
}
