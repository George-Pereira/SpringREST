package com.fernando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/livros")

public class Livrocontroller 
{
	@GetMapping
	@ApiOperation(value = "Retorna uma string por meio da API")
	@ApiResponses(value = {
							@ApiResponse(code = 200, message = "Operação efetuada com Sucesso!")
	})
	public String hello() 
	{
		return "Olá! Bem vindo a nossa Livraria! Essa mensagem está funcionando por meio do acesso de um endpoint de uma API REST!!!";
	}
}
