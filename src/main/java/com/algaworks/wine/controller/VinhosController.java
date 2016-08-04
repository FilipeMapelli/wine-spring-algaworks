package com.algaworks.wine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.wine.repository.Vinhos;

@Controller
@RequestMapping("/vinhos")
public class VinhosController {

	@Autowired
	private Vinhos vinhos;
	
	@RequestMapping
	public String pesquisa(Model model) {
		model.addAttribute("vinhos", vinhos.findAll());
		return "/vinho/ListagemVinhos";
	}
	
	@RequestMapping("/novo")
	public String novo() {
		return "/produto/CadastroProduto";
	}
	
}
