package com.sandbox.transporte;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEncryptableProperties
@ComponentScan("com.sandbox.*")
@EnableJpaRepositories("com.sandbox.*")
@EntityScan("com.sandbox.persistencia*")
@SpringBootApplication
public class TransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransporteApplication.class, args);
	}

}
