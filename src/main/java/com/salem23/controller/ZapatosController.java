package com.salem23.controller;

import com.salem23.models.entity.*;
import com.salem23.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/zapatos")
public class ZapatosController {
	@Autowired
	ZapatosService zService;
	
	@GetMapping("/{id}")
	public Optional<Zapatos> buscarPorId(@PathVariable Integer id){
		return zService.findById(id);
	}
	@GetMapping("/listar")
	public List<Zapatos> listaTodos(){
		return zService.findAll();
	}
	@PostMapping
	public Zapatos guardar(@RequestBody Zapatos color) {
		return zService.save(color);
	}
	@PutMapping ("/actualizar/{id}")
	public Zapatos actualizar(@RequestBody Zapatos zapatos,@PathVariable Integer id) {
			Zapatos zEnBD=zService.findById(id).get();
			System.out.print("e por body:"+zapatos);
			System.out.print("en DB"+zEnBD);
			zEnBD.setIdZapato(zapatos.getIdZapato());
			zEnBD.setIdColor(zapatos.getIdColor());
			zEnBD.setCedulaUsuario(zapatos.getCedulaUsuario());
			zEnBD.setEstadoZapato(zapatos.getEstadoZapato());
			zEnBD.setIdLineaZapato(zapatos.getIdLineaZapato());
			zEnBD.setIdMarca(zapatos.getIdMarca());
			zEnBD.setPrecio(zapatos.getPrecio());
			zEnBD.setTalla(zapatos.getTalla());
			zEnBD.setTipoZapato(zapatos.getTipoZapato());
			System.out.println("Asi quedo en DB"+zEnBD);
			zService.save(zEnBD);
			return zapatos;
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		zService.DeleteById(id);
	}
}
