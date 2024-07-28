package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Classe responsável por fornecer instâncias de objetos para o container.
 */
@Configuration
public class BeansFactory {
    @Bean
    public Gson gson() {
        return new Gson();
    }
}