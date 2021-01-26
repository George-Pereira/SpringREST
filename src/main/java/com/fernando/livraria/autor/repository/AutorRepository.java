package com.fernando.livraria.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.livraria.autor.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>
{

}
