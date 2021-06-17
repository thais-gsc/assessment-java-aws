package br.edu.infnet.assessment.service;

import java.util.List;

import br.edu.infnet.assessment.model.Cotacao;

public interface ICotacaoService {
    void store(Cotacao cotacao);
    void deletarCotacaoPorId(Long id);
    Cotacao pegarCotacaoPorId(Long id);
    List<Cotacao> pegarCotacoes();
}
