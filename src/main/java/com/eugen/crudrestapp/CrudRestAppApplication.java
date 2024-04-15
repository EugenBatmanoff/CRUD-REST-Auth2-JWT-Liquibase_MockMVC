package com.eugen.crudrestapp;

import com.eugen.crudrestapp.security.config.RsaKeyConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfigProperties.class)
public class CrudRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRestAppApplication.class, args);
	}
	/*
	//Test User creation
	@Bean
	public CommandLineRunner initializeUser(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		return args -> {

			User user = new User();
			user.setUsername("exampleuser");
			user.setEmail("example@gmail.com");
			user.setPassword(passwordEncoder.encode("examplepassword"));
			userRepository.save(user);

		};
	}*/
}
