package com.consoli.projeto_final_user.repositories;

import com.consoli.projeto_final_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
