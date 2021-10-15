package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {
	@Autowired
	EstadoService estadoService;
	
	@GetMapping("/{id}")
	public Optional<Estado> buscarPorId(@PathVariable Integer id){
		return estadoService.findById(id);
	}
	@GetMapping("/listar")
	public List<Estado> listaTodos(){
		return estadoService.findAll();
	}
	@PostMapping
	public Estado guardar(@RequestBody Estado estado) {
		return estadoService.save(estado);
	}
	@PutMapping ("/actualizar/{id}")
	public Estado actualizar(@RequestBody Estado estado,@PathVariable Integer id) {
			Estado eEnBD=estadoService.findById(id).get();
			System.out.print("e por body:"+estado);
			System.out.print("en DB"+eEnBD);
			eEnBD.setIdEstado(estado.getIdEstado());
			eEnBD.setPorcentaje(estado.getPorcentaje());
			System.out.println("Asi quedo en DB"+eEnBD);
			estadoService.save(eEnBD);
			return estado;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		estadoService.DeleteById(id);
	}
}
