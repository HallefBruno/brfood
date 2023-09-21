package br.com.company.brfood.model;

import java.math.BigDecimal;
import java.util.Date;

public class Produto {

    private Long id;
    private String nome;
    private String detalhes;
    private BigDecimal preco;
    private Boolean ativo;
    private Date dataCadastro;

    public Produto() {
    }

    public Produto(Long id, String nome, String detalhes, BigDecimal preco, Boolean ativo, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.detalhes = detalhes;
        this.preco = preco;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
