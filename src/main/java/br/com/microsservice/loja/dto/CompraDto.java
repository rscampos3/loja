package br.com.microsservice.loja.dto;

import java.util.List;

import lombok.Data;

@Data
public class CompraDto {
	private List<ItemCompraDto> itens;
	private EnderecoDto endereco;
}
