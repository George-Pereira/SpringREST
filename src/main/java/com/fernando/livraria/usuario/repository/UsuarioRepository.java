package com.fernando.livraria.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.livraria.usuario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
