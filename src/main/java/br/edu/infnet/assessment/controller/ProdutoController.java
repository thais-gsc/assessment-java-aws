package br.edu.infnet.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    // Bem possível que eu esteja fazendo algo errado, qualquer coisa só mudar

    @GetMapping
    public String produtos() {
        return "listarProdutos";
    }

    @GetMapping("/editar/{id}")
    public String editarProduto(@RequestParam(value = "id") Long id) {
        // Aqui irá editar o produto e tals...
        return "listarProdutos";
    }

    @RequestMapping(value = "/deletar/{id}", method = RequestMethod.POST)
    public String deletarProduto(@RequestParam(value = "id") Long id) {
        // Aqui irá deletar o produto e tals...
        return "listarProdutos";
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public String criarProduto() {
        // Aqui irá chamar a api e tals...
        return "listarProdutos";
    }

}
