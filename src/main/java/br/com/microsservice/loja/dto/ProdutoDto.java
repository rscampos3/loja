package br.com.microsservice.loja.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProdutoDto {
	private Long id;

	private String nome;

	private String estado;

	private String descricao;

	private BigDecimal preco;
}
