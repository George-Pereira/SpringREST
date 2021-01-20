package com.fernando.livraria.usuario.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genero 
{
	MASCULINO("Masculino"), FEMININO("Feminino");
	private String descricao;
	Genero(String descricao) 
	{
		this.descricao = descricao;
	}
	public String getDescricao() 
	{
		return descricao;
	}
}

