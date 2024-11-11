package com.consoli.projeto_final_meme.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://localhost:8081") // URL do microserviço User
public interface UserClient {

    @GetMapping("/user/usuarios/{id}")
    UserDTO buscarUsuarioPorId(@PathVariable("id") Long id);
}