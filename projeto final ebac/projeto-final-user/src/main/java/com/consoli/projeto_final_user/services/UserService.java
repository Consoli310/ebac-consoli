package com.consoli.projeto_final_user.services;

import com.consoli.projeto_final_user.entities.User;
import com.consoli.projeto_final_user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User novoUsuario(User usuario) {
        return userRepository.save(usuario);
    }

    public List<User> listaTodosUsuarios() {
        return userRepository.findAll();
    }
}
