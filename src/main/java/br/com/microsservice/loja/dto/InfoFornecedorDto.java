package br.com.microsservice.loja.dto;

import lombok.Data;

@Data
public class InfoFornecedorDto {

	private Long id;
	private String nome;
	private String estado;
	private String endereco;

}
