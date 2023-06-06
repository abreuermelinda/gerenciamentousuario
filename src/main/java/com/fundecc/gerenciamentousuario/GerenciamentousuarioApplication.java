package com.fundecc.gerenciamentousuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.fundecc.gerenciamentousuario.repository")
public class GerenciamentousuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentousuarioApplication.class, args);
	}

}
