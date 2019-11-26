package br.com.microsservice.loja.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microsservice.loja.dto.CompraDto;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@PostMapping
	public void realizarCompra(@RequestBody CompraDto compra) {
		
	}
}
