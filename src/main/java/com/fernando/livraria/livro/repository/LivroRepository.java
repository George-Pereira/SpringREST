package com.fernando.livraria.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.livraria.livro.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
