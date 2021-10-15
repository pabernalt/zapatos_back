package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {
	@Autowired
	MarcaService marcaService;
	
	@GetMapping("/{id}")
	public Optional<Marca> buscarPorId(@PathVariable Integer id){
		return marcaService.findById(id);
	}
	@GetMapping("/listar")
	public List<Marca> listaTodos(){
		return marcaService.findAll();
	}
	@PostMapping
	public Marca guardar(@RequestBody Marca marca) {
		return marcaService.save(marca);
	}
	@PutMapping ("/actualizar/{id}")
	public Marca actualizar(@RequestBody Marca marca,@PathVariable Integer id) {
			Marca mEnBD=marcaService.findById(id).get();
			System.out.print("e por body:"+marca);
			System.out.print("en DB"+mEnBD);
			mEnBD.setIdMarca(marca.getIdMarca());
			mEnBD.setNombreMarca(marca.getNombreMarca());
			System.out.println("Asi quedo en DB"+mEnBD);
			marcaService.save(mEnBD);
			return marca;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		marcaService.DeleteById(id);
	}
}
