package com.consoli.projeto_final_meme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjetoFinalMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalMemeApplication.class, args);
	}

}
