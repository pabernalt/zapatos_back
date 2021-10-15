package com.salem23.models.services;

import com.salem23.models.entity.*;
import com.salem23.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoZapatoServiceImpl implements TipoZapatoService {
	@Autowired	
	TipoZapatoRepository tipoZapatoRepository;	
		
	@Override
	public Optional<TipoZapato> findById(Integer id){
		return tipoZapatoRepository.findById(id);
	}
	@Override
	public List<TipoZapato> findAll(){
		return tipoZapatoRepository.findAll();
	}
	@Override
	public TipoZapato save(TipoZapato user) {
		return tipoZapatoRepository.save(user);
	}
	@Override
	public void DeleteById(Integer id) {
		tipoZapatoRepository.deleteById(id);
	}
	
}
