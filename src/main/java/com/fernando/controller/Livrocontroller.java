package com.fernando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class Livrocontroller 
{
	@GetMapping
	public String hello() 
	{
		return "Olá Mundo";
	}
}
