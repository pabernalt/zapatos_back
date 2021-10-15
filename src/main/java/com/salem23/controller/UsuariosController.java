//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.salem23.controller;

import com.salem23.models.entity.Usuarios;
import com.salem23.models.services.UsuarioService;
import com.salem23.models.vo.LoginRequest;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/usuario"})
@CrossOrigin({"http://loclhost:8081"})
public class UsuariosController {
	@Autowired
	UsuarioService usuarioService;

	public UsuariosController() {
	}

	@GetMapping({"/{id}"})
	public Optional<Usuarios> buscarPorId(@PathVariable Integer id) {
		return this.usuarioService.findById(id);
	}

	@GetMapping({"/listar"})
	public List<Usuarios> listaTodos() {
		return this.usuarioService.findAll();
	}

	@PostMapping
	public Usuarios guardar(@RequestBody Usuarios usuario) {
		Optional<Usuarios> usuarios = this.usuarioService.findByUserName(usuario.getUsername());
		if (usuarios.isPresent()) {
			throw new RuntimeException();
		} else {
			return this.usuarioService.save(usuario);
		}
	}

	@PostMapping({"/login"})
	public Usuarios login(@RequestBody LoginRequest request) {
		return (Usuarios)this.usuarioService.findByUserName(request.getUsername()).orElseThrow(RuntimeException::new);
	}

	@PutMapping({"/actualizar/{id}"})
	public Usuarios actualizar(@RequestBody Usuarios usuario, @PathVariable Integer id) {
		Usuarios uEnBD = (Usuarios)this.usuarioService.findById(id).get();
		System.out.print("e por body:" + usuario);
		System.out.print("en DB" + uEnBD);
		uEnBD.setCedula(usuario.getCedula());
		uEnBD.setNombres(usuario.getNombres());
		uEnBD.setApellidos(usuario.getApellidos());
		uEnBD.setEmail(usuario.getEmail());
		uEnBD.setUsername(usuario.getUsername());
		uEnBD.setPassword(usuario.getPassword());
		uEnBD.setIdPais(usuario.getIdPais());
		System.out.println("Asi quedo en DB" + uEnBD);
		this.usuarioService.save(uEnBD);
		return usuario;
	}

	@DeleteMapping({"{id}"})
	public void eliminar(@PathVariable Integer id) {
		this.usuarioService.DeleteById(id);
	}
}
