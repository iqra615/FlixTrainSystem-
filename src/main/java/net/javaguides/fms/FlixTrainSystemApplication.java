package net.javaguides.fms;

import net.javaguides.fms.repository.FlixRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class FlixTrainSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlixTrainSystemApplication.class, args);


	}

	private FlixRepository flixRepository;
}
