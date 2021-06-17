package br.edu.infnet.assessment.model;

import java.util.List;

public class Cotacao {

    private List<Produto> listaProdutos;

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Cotacao(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Cotacao() {
    }

}
