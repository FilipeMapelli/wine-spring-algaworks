package com.algaworks.wine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.wine.dto.Foto;
import com.algaworks.wine.service.CadastroVinhoService;

@RestController
@RequestMapping("/fotos")
public class FotosController {
	
	@Autowired
	private CadastroVinhoService cadastroVinhoService;
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.POST)
	public Foto upload(@PathVariable Long codigo, 
			@RequestParam("files[]") MultipartFile[] files){	
		
		String url = cadastroVinhoService.salvarFoto(codigo,files[0]);
		return new Foto(url);
	}

}
