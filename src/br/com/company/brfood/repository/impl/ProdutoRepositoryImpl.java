package br.com.company.brfood.repository.impl;

import br.com.company.brfood.conexao.ConnectionFactory;
import br.com.company.brfood.model.Produto;
import br.com.company.brfood.repository.ProdutoRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepositoryImpl implements ProdutoRepository {
    
    @Override
    public void salvar(Produto produto) {
        var banco = ConnectionFactory.getInstance();
        try {
            banco.conexao();
            banco.abrirTransacao();
            var stmt = banco.conn.prepareStatement(" INSERT INTO PRODUTO(NOME, DETALHES, PRECO, ATIVO) VALUES(?,?,?,?) ");
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDetalhes());
            stmt.setBigDecimal(3, produto.getPreco());
            stmt.setBoolean(4, produto.getAtivo());
            stmt.executeUpdate();
            banco.fecharTransacao();
            banco.desconecta();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @Override
    public List<Produto> produtos(String query) {
        try {
            var banco = ConnectionFactory.getInstance();
            banco.conexao();
            
            Map<String, Object> params = new LinkedHashMap<>();
            StringBuilder sql = new StringBuilder();
            sql.append(" SELECT * FROM PRODUTO P WHERE 1=1 ");
            
            if(!query.isBlank()) {
                sql.append(" AND ( P.NOME ILIKE (?) OR P.DETALHES ILIKE (?) ) ");
                params.put("nome", query + "%");
                params.put("descricao", query + "%");
            }
            
            sql.append(" ORDER BY ID ASC ");
            banco.executaPS(sql.toString(), params);
            List<Produto> produtos = new ArrayList<>();
            
            while (banco.rs.next()) {
                produtos.add(
                    new Produto(
                     banco.rs.getLong("id"), 
                    banco.rs.getString("nome"), 
                 banco.rs.getString("detalhes"), 
                   banco.rs.getBigDecimal("preco"), 
                   banco.rs.getBoolean("ativo"),
              banco.rs.getDate("data_cadastro")
                    )
                );
            }
            
            banco.desconecta();
            
            return produtos;
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
}
