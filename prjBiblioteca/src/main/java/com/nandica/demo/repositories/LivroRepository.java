package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
