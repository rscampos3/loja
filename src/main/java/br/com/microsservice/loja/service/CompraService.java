package br.com.microsservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microsservice.loja.client.FornecedorClient;
import br.com.microsservice.loja.dto.CompraDto;
import br.com.microsservice.loja.dto.InfoFornecedorDto;
import br.com.microsservice.loja.dto.InfoPedidoDto;
import br.com.microsservice.loja.model.Compra;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CompraService {

	@Autowired
	private FornecedorService fornecedorService;

	public Compra realizaCompra(CompraDto compraDto) {

		InfoFornecedorDto infoFornecedorDto = this.fornecedorService
				.getInformacoesFornecedor(compraDto.getEndereco().getEstado());

		InfoPedidoDto infoPedidoDto = this.fornecedorService.realizaPedido(compraDto.getItens());

		Compra compra = new Compra();
		compra.setPedidoId(infoPedidoDto.getId());
		compra.setTempoDePreparo(infoPedidoDto.getTempoDePreparo());
		compra.setEnderecoDestino(compraDto.getEndereco().toString());
		return compra;
	}
}
