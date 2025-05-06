package com.nandica.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandica.demo.entities.Livro;
import com.nandica.demo.services.LivroService;


@RestController
@RequestMapping("/livros")
public class LivroController {
	
	private final LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@PostMapping("/create")
	public Livro createLivro(@RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	@GetMapping("/all")
	public List<Livro> getAllLivros(){
		return livroService.getAllLivros();
	}
	
	@GetMapping("/{id}")
	public Livro getProduto(@PathVariable Long id) {
		return livroService.getLivroById(id);
	}
	
}
