package br.com.microsservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microsservice.loja.client.FornecedorClient;
import br.com.microsservice.loja.dto.InfoFornecedorDto;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorClient fornecedorApi;
	
	public InfoFornecedorDto getFornecedorPorEstado(String uf) {
		return this.fornecedorApi.getInformacoesFornecedor(uf);
	}
}
