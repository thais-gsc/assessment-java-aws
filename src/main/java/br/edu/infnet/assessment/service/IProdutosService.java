package br.edu.infnet.assessment.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.assessment.model.Produto;

@FeignClient(url = "URL AQUI", name = "IProdutosService")
public interface IProdutosService {
    @GetMapping(value = "CAMINHO AQUI")
    Produto pegarProdutos();

    @GetMapping(value = "CAMINHO AQUI {id}")
    Produto pegarProdutoPorId(@PathVariable("id") String id);

}
