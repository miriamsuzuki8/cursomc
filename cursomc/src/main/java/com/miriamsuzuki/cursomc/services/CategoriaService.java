package com.miriamsuzuki.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miriamsuzuki.cursomc.domain.Categoria;
import com.miriamsuzuki.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository repo;

	public Categoria busca(Integer id) {
		Optional<Categoria> categoria =repo.findById(id);
		return categoria.orElse(null);
	}
}
