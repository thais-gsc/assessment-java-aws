package br.edu.infnet.assessment.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cotacoes")
public class Cotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cot_id", referencedColumnName = "id")
    private List<Produto> produtos;
    
    private String fornecedor;
    private String contato;
    private Long quantidade;
    private LocalDateTime data;
    private BigDecimal preco;

    public Cotacao() {
    }

    public Cotacao(String fornecedor, String contato, Long quantidade, LocalDateTime data,
            BigDecimal preco) {
        this.fornecedor = fornecedor;
        this.contato = contato;
        this.quantidade = quantidade;
        this.data = data;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    // private List<Produto> listaProdutos;

    // public List<Produto> getListaProdutos() {
    //     return listaProdutos;
    // }

    // public void setListaProdutos(List<Produto> listaProdutos) {
    //     this.listaProdutos = listaProdutos;
    // }

    // public Cotacao(List<Produto> listaProdutos) {
    //     this.listaProdutos = listaProdutos;
    // }

    // public Cotacao() {
    // }

}
