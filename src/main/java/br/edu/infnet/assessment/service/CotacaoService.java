package br.edu.infnet.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.assessment.model.Cotacao;
import br.edu.infnet.assessment.repository.CotacaoRepository;

@Service
public class CotacaoService implements ICotacaoService {

    @Autowired
    private CotacaoRepository cotacaoRepository;

    @Override
    public void store(Cotacao cotacao) {
        cotacaoRepository.save(cotacao);
    }

    @Override
    public void deletarCotacaoPorId(Long id) {
        cotacaoRepository.deleteById(id);
    }

    @Override
    public Cotacao pegarCotacaoPorId(Long id) {
        return cotacaoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cotacao> pegarCotacoes() {
        return (List<Cotacao>) cotacaoRepository.findAll();
    }
    
}
