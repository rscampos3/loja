package br.com.microsservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microsservice.loja.dto.CompraDto;
import br.com.microsservice.loja.dto.InfoFornecedorDto;
import br.com.microsservice.loja.service.FornecedorService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private FornecedorService fornecedorService;

	@PostMapping
	public ResponseEntity<InfoFornecedorDto> realizarCompra(@RequestBody CompraDto compra) {
		return new ResponseEntity<InfoFornecedorDto>(
				this.fornecedorService.getFornecedorPorEstado(compra.getEndereco().getEstado()), HttpStatus.OK);
	}
}
