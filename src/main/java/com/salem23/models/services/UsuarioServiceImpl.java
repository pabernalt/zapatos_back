package com.salem23.models.services;

import com.salem23.models.entity.Usuarios;
import com.salem23.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired	
	UsuariosRepository usuariosRepository;

	public Optional<Usuarios> findById(Integer id) {
		return this.usuariosRepository.findById(id);
	}

	public Optional<Usuarios> findByUserName(String username) {
		return this.usuariosRepository.findByUsername(username);
	}

	public List<Usuarios> findAll() {
		return this.usuariosRepository.findAll();
	}

	public Usuarios save(Usuarios user) {
		return (Usuarios)this.usuariosRepository.save(user);
	}

	public void DeleteById(Integer id) {
		this.usuariosRepository.deleteById(id);
	}
	
}
