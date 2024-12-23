package ie.atu.customerservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomerWebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Allow CORS for all endpoints
                        .allowedOrigins("http://localhost:63342", "http://localhost:8082") // Replace with your frontend's domain and port
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // HTTP methods you want to allow
                        .allowedHeaders("*") // Allow all headers
                        .allowCredentials(true); // Allow cookies if needed
            }
        };
    }
}