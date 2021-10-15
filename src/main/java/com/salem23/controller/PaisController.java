package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pais")
public class PaisController {
	@Autowired
	PaisService paisService;
	
	@GetMapping("/{id}")
	public Optional<Pais> buscarPorId(@PathVariable Integer id){
		return paisService.findById(id);
	}
	@GetMapping("/listar")
	public List<Pais> listaTodos(){
		return paisService.findAll();
	}
	@PostMapping
	public Pais guardar(@RequestBody Pais pais) {
		return paisService.save(pais);
	}
	@PutMapping ("/actualizar/{id}")
	public Pais actualizar(@RequestBody Pais pais,@PathVariable Integer id) {
			Pais pEnBD=paisService.findById(id).get();
			System.out.print("e por body:"+pais);
			System.out.print("en DB"+pEnBD);
			pEnBD.setIdPais(pais.getIdPais());
			pEnBD.setNombrePais(pais.getNombrePais());
			System.out.println("Asi quedo en DB"+pEnBD);
			paisService.save(pEnBD);
			return pais;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		paisService.DeleteById(id);
	}
}
