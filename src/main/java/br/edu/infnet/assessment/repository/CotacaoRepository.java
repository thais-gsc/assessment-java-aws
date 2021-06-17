package br.edu.infnet.assessment.repository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.assessment.model.Cotacao;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CotacaoRepository extends CrudRepository<Cotacao, Long> {
}
