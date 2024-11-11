package com.consoli.projeto_final_user.controllers;

import com.consoli.projeto_final_user.entities.User;
import com.consoli.projeto_final_user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> buscaUsuarios() {
        return userService.listaTodosUsuarios();
    }

    @PostMapping("/users")
    public User novoUsuario(@RequestBody User usuario) {
        return userService.novoUsuario(usuario);
    }

}
