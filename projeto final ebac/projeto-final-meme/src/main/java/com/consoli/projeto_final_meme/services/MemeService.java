package com.consoli.projeto_final_meme.services;

import com.consoli.projeto_final_meme.entities.Meme;
import com.consoli.projeto_final_meme.repositories.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class MemeService {


    @Autowired
    private MemeRepository memeRepository;

    public List<Meme> listaTodosMemes() {
        return memeRepository.findAll();
    }

    public Meme novoMeme(Meme meme) {
        return memeRepository.save(meme);
    }
}