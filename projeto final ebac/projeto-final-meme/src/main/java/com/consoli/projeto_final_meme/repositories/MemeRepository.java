package com.consoli.projeto_final_meme.repositories;

import com.consoli.projeto_final_meme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme, Long> {
}
