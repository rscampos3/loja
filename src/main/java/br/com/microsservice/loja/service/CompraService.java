package br.com.microsservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microsservice.loja.client.FornecedorClient;
import br.com.microsservice.loja.dto.CompraDto;
import br.com.microsservice.loja.dto.InfoFornecedorDto;

@Service
public class CompraService {

	@Autowired
	private FornecedorClient fornecedorClient;

	public void realizaCompra(CompraDto compraDto) {
		InfoFornecedorDto infoFornecedorDto = this.fornecedorClient
				.getInformacoesFornecedor(compraDto.getEndereco().getEstado());
	}
}
