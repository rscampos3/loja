package br.com.microsservice.loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.microsservice.loja.dto.InfoFornecedorDto;
import br.com.microsservice.loja.dto.ItemDoPedidoDto;
import br.com.microsservice.loja.dto.InfoPedidoDto;
import br.com.microsservice.loja.dto.ProdutoDto;

@FeignClient(name = "fornecedor")
public interface FornecedorClient {
	
	@RequestMapping(value="/info/{uf}", method=RequestMethod.GET)
	InfoFornecedorDto getInformacoesFornecedor(@PathVariable("uf") String uf);
	
	@RequestMapping(value="/pedido", method = RequestMethod.POST)
	InfoPedidoDto realizaPedido(@RequestBody List<ItemDoPedidoDto> produtos);
	
	@RequestMapping("/pedido/{id}")
	InfoPedidoDto getPedidoPorId(@PathVariable Long id);
	
	@RequestMapping("/{estado}")
	List<ProdutoDto> getProdutosPorEstado(@PathVariable("estado") String estado);

}
