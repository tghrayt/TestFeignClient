package tg.youssef.test;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
@EnableFeignClients

public class TestApplication implements CommandLineRunner{
	

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		
	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
