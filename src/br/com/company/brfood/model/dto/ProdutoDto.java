package br.com.company.brfood.model.dto;

import java.math.BigDecimal;

public class ProdutoDto {

    private String nome;
    private String detalhes;
    private BigDecimal preco;
    private Boolean ativo;

    public ProdutoDto() {
    }

    public ProdutoDto(String nome, String detalhes, BigDecimal preco, Boolean ativo) {
        this.nome = nome;
        this.detalhes = detalhes;
        this.preco = preco;
        this.ativo = ativo;
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
    
    
    
}