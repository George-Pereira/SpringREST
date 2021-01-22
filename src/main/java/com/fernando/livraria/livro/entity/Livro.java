package com.fernando.livraria.livro.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fernando.livraria.autor.entity.Autor;
import com.fernando.livraria.editora.entity.Editora;
import com.fernando.livraria.entity.Auditoria;
import com.fernando.livraria.usuario.entity.Usuario;

import lombok.Data;

@Data	
@Entity

public class Livro extends Auditoria
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length= 100)
	private String titulo;
	@Column(nullable= false)
	private String isbn;
	@Column(columnDefinition = "integer default 0")
	private int paginas;
	@Column(columnDefinition = "integer default 0")
	private int capitulos;
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Autor autor;
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Usuario cliente;
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Editora editora;
}
