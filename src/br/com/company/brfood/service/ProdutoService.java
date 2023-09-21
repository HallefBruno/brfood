package br.com.company.brfood.service;

import br.com.company.brfood.model.Produto;
import br.com.company.brfood.repository.ProdutoRepository;
import br.com.company.brfood.repository.impl.ProdutoRepositoryImpl;
import java.util.List;

public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = new ProdutoRepositoryImpl();
    }
    
    public void salvar(Produto produto) {
        this.produtoRepository.salvar(produto);
    }
    
    public List<Produto> produtos(String query) {
        return this.produtoRepository.produtos(query);
    }
    
}
