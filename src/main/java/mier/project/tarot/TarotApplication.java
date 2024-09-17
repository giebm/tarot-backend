package mier.project.tarot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TarotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarotApplication.class, args);
		System.out.println("Hello, Tarot!");
	}

	
}
