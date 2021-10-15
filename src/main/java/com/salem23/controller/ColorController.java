package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/color")
public class ColorController {
	@Autowired
	ColorService colorService;
	
	@GetMapping("/{id}")
	public Optional<Color> buscarPorId(@PathVariable Integer id){
		return colorService.findById(id);
	}
	@GetMapping("/listar")
	public List<Color> listaTodos(){
		return colorService.findAll();
	}
	@PostMapping
	public Color guardar(@RequestBody Color color) {
		return colorService.save(color);
	}
	@PutMapping ("/actualizar/{id}")
	public Color actualizar(@RequestBody Color color,@PathVariable Integer id) {
			Color cEnBD=colorService.findById(id).get();
			System.out.print("e por body:"+color);
			System.out.print("en DB"+cEnBD);
			cEnBD.setIdColor(color.getIdColor());
			cEnBD.setNombreColor(color.getNombreColor());
			System.out.println("Asi quedo en DB"+cEnBD);
			colorService.save(cEnBD);
			return color;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		colorService.DeleteById(id);
	}
}
