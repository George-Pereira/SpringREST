package com.fernando.livraria.usuario.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fernando.livraria.entity.Auditoria;
import com.fernando.livraria.livro.entity.Livro;
import com.fernando.livraria.usuario.enums.Genero;

import lombok.Data;

@Data
@Entity

public class Usuario extends Auditoria
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(nullable= false)
	private String nome;
	@Column(nullable= false)
	private int idade;
	@Enumerated(EnumType.STRING)
	@Column(nullable= false, length= 20)
	private Genero genero;
	@Column(nullable= false, unique= true, length= 100)
	private String email;
	@Column(nullable= false, unique= true)
	private String username;
	@Column(nullable= false)
	private String senha;
	@Column(nullable= false, columnDefinition = "TIMESTAMP")
	private LocalDate nascimento;
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Livro> compras;
	
}
