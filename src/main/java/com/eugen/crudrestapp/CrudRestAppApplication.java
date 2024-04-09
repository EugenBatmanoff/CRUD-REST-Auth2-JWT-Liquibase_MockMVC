package com.eugen.crudrestapp;

import com.eugen.crudrestapp.security.config.RsaKeyConfigProperties;
import com.eugen.crudrestapp.security.user.User;
import com.eugen.crudrestapp.security.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfigProperties.class)
public class CrudRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRestAppApplication.class, args);
	}
	/*@Bean
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
