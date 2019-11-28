package br.com.microsservice.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.microsservice.loja.client.FornecedorClient;
import br.com.microsservice.loja.dto.InfoFornecedorDto;
import br.com.microsservice.loja.dto.InfoPedidoDto;
import br.com.microsservice.loja.dto.ItemDoPedidoDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FornecedorService {

	@Autowired
	private FornecedorClient fornecedorClient;
	
	public InfoFornecedorDto getInformacoesFornecedor(String uf) {
		log.info("buscando informações do fornecedor de {}", uf);
		return this.fornecedorClient.getInformacoesFornecedor(uf);
	}
	
	public InfoPedidoDto realizaPedido(@RequestBody List<ItemDoPedidoDto> produtos) {
		log.info("realizando um pedido");
		return this.fornecedorClient.realizaPedido(produtos);
	}
	
	
}
