package com.nandica.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandica.demo.entities.Livro;
import com.nandica.demo.repositories.LivroRepository;

@Service
public class LivroService {
	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	
	public List<Livro> getAllLivros(){
		return livroRepository.findAll();
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
}

