package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/lineazapato")
public class LineaZapatoController {
	@Autowired
	LineaZapatoService lZService;
	
	@GetMapping("/{id}")
	public Optional<LineaZapato> buscarPorId(@PathVariable Integer id){
		return lZService.findById(id);
	}
	@GetMapping("/listar")
	public List<LineaZapato> listaTodos(){
		return lZService.findAll();
	}
	@PostMapping
	public LineaZapato guardar(@RequestBody LineaZapato color) {
		return lZService.save(color);
	}
	@PutMapping ("/actualizar/{id}")
	public LineaZapato actualizar(@RequestBody LineaZapato lz,@PathVariable Integer id) {
			LineaZapato lzEnBD=lZService.findById(id).get();
			System.out.print("e por body:"+lz);
			System.out.print("en DB"+lzEnBD);
			lzEnBD.setIdLinea(lz.getIdLinea());
			lzEnBD.setNombreLinea(lz.getNombreLinea());
			System.out.println("Asi quedo en DB"+lzEnBD);
			lZService.save(lzEnBD);
			return lz;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		lZService.DeleteById(id);
	}
}
