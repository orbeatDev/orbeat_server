package supporty.orbeat.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://orbeat.co.kr",
                        "http://www.orbeat.co.kr",
                        "https://orbeat.co.kr",
                        "https://www.orbeat.co.kr"
                )
                .allowedHeaders("*")
                .allowedMethods("GET", "POST", "OPTIONS")
                .allowCredentials(false);
    }
}
