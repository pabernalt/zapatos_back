package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipozapato")
public class TipoZapatoController {
	@Autowired
	TipoZapatoService tipoZapatoService;
	
	@GetMapping("/{id}")
	public Optional<TipoZapato> buscarPorId(@PathVariable Integer id){
		return tipoZapatoService.findById(id);
	}
	@GetMapping("/listar")
	public List<TipoZapato> listaTodos(){
		return tipoZapatoService.findAll();
	}
	@PostMapping
	public TipoZapato guardar(@RequestBody TipoZapato pais) {
		return tipoZapatoService.save(pais);
	}
	@PutMapping ("/actualizar/{id}")
	public TipoZapato actualizar(@RequestBody TipoZapato tzapato,@PathVariable Integer id) {
		    TipoZapato tzEnBD=tipoZapatoService.findById(id).get();
			System.out.print("e por body:"+tzapato);
			System.out.print("en DB"+tzEnBD);
			tzEnBD.setIdTipo(tzapato.getIdTipo());
			tzEnBD.setNombreTipo(tzapato.getNombreTipo());
			System.out.println("Asi quedo en DB"+tzEnBD);
			tipoZapatoService.save(tzEnBD);
			return tzapato;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		tipoZapatoService.DeleteById(id);
	}
}
