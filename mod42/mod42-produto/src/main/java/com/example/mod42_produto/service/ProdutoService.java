package com.example.mod42_produto.service;

import com.example.mod42_produto.entity.Produto;
import com.example.mod42_produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Produto atualizarProduto(Long id, Produto produto) {
        Produto produtoExistente = buscarProdutoPorId(id);
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setQuantidade(produto.getQuantidade());
        return produtoRepository.save(produtoExistente);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
