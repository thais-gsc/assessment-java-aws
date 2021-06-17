package br.edu.infnet.assessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;
    private String fabricante;
    private String descricao;
    private String classificacao;

    public Produto(String nome, String fabricante, String descricao, String classificacao) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.classificacao = classificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    
    // private String tipo;

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getNome() {
    //     return nome;
    // }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public String getTipo() {
    //     return tipo;
    // }

    // public void setTipo(String tipo) {
    //     this.tipo = tipo;
    // }

    // public Produto(int id, String nome, String tipo) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.tipo = tipo;
    // }

    // public Produto() {
    // }

}
