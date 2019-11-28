package br.com.microsservice.loja.dto;

import lombok.Data;

@Data
public class EnderecoDto {

	private String rua;
	private Integer numero;
	private String estado;
	@Override
	public String toString() {
		return "rua " + this.rua + ", "+ this.numero + ", " + this.estado;
	}
	
	
}
