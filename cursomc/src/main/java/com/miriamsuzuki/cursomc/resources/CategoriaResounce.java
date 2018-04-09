package com.miriamsuzuki.cursomc.resources;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miriamsuzuki.cursomc.domain.Categoria;
import com.miriamsuzuki.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResounce {
	
	@Autowired
	public CategoriaService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> fing(@PathVariable Integer id) {
		Categoria categoria = service.busca(id);
				
		return ResponseEntity.ok().body(categoria);
	}
}
