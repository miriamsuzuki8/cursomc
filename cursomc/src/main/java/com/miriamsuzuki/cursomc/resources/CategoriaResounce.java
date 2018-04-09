package com.miriamsuzuki.cursomc.resources;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miriamsuzuki.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResounce {

	@RequestMapping(method=RequestMethod.GET)
	public java.util.List<Categoria> listas() {
		Categoria categoria1 = new Categoria(1, "Informática");
		Categoria categoria2 = new Categoria(2, "Escritório");
		
		java.util.List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		
		return categorias;
	}
}
