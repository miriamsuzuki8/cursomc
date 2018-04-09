package com.miriamsuzuki.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResounce {

	@RequestMapping(method=RequestMethod.GET)
	public String listas() {
		return "Rest funcionando";
	}
}
