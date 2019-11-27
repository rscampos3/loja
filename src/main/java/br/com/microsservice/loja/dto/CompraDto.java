package br.com.microsservice.loja.dto;

import java.util.List;

import lombok.Data;

@Data
public class CompraDto {
	private List<ItemDoPedidoDto> itens;
	private EnderecoDto endereco;
}
