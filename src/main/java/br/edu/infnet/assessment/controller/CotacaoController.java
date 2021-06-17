package br.edu.infnet.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cotacoes")
public class CotacaoController {

    // Bem possível que eu esteja fazendo algo errado, qualquer coisa só mudar
    
    @GetMapping
    public String cotacoes() {
        return "listarCotacoes";
    }

    @GetMapping("/editar/{id}")
    public String editarCotacao(@RequestParam(value = "id") Long id) {
        // Aqui irá fazer a edição de uma cotação pelo id;
        return "listarCotacoes";
    }

    @RequestMapping(value = "/deletar/{id}", method = RequestMethod.POST)
    public String deletarCotacao(@RequestParam(value = "id") Long id) {
        // Aqui irá deletar uma cotação pelo id;
        return "listarCotacoes";
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public String criarCotacao() {
        return "listarCotacoes";
    }

}
