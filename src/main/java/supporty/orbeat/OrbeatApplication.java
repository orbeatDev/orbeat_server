package supporty.orbeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class OrbeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrbeatApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://orbeat.co.kr", "http://www.orbeat.co.kr", "https://orbeat.co.kr", "https://www.orbeat.co.kr");
			}
		};
	}
}
