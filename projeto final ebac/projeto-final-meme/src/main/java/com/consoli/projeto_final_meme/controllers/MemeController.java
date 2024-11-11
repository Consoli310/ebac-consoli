package com.consoli.projeto_final_meme.controllers;

import com.consoli.projeto_final_meme.entities.Meme;
import com.consoli.projeto_final_meme.services.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meme")
public class MemeController {

    @Autowired
    private MemeService memeService;

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        return memeService.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        return memeService.novoMeme(meme);
    }
}
