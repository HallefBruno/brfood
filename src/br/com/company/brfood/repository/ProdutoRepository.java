
package br.com.company.brfood.repository;

import br.com.company.brfood.model.Produto;
import java.util.List;

public interface ProdutoRepository {
    
    void salvar(Produto produto);
    
    List<Produto> produtos(String query);
    
}
