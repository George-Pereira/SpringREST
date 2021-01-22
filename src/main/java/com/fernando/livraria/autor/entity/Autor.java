package com.fernando.livraria.autor.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fernando.livraria.entity.Auditoria;
import com.fernando.livraria.livro.entity.Livro;

import lombok.Data;

@Data
@Entity
public class Autor extends Auditoria
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable= false, unique= true)
	private String nome;
	@Column(columnDefinition = "integer default 0")
	private int idade;
	@OneToMany(mappedBy = "autor", fetch = FetchType.LAZY)
	private List<Livro> obras;
}
