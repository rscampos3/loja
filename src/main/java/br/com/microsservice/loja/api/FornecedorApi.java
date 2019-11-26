package br.com.microsservice.loja.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.microsservice.loja.dto.InfoFornecedorDto;

@FeignClient(value = "fornecedor", url = "http://localhost:8081")
public interface FornecedorApi {
	
	@RequestMapping(value="/info/estado/{uf}", method=RequestMethod.GET)
	public InfoFornecedorDto getInformacoesFornecedor(@PathVariable("uf") String uf);

}
