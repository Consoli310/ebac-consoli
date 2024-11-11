package com.consoli.projeto_final_meme.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "db_meme")
public class Meme {

    @Id
    private Long id;
    private String nome;
    private String urlImagem;

    @ManyToOne
    private MemeCategory categoria;


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

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public MemeCategory getCategoria() {
        return categoria;
    }

    public void setCategoria(MemeCategory categoria) {
        this.categoria = categoria;
    }
}
