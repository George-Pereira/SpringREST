package com.fernando.livraria.editora.entity;

import java.time.LocalDate;
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

public class Editora extends Auditoria
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, unique=true)
	private String nome;
	@Column(nullable=false, unique=true, length=100)
	private String code;
	@Column(nullable=false, columnDefinition = "TIMESTAMP")
	private LocalDate fundaçãoData;
	@OneToMany(mappedBy = "editora", fetch = FetchType.LAZY)
	private List<Livro> publicacoes;
}
