package dio.web.api.doc;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Rest com Spring Boot")
                        .description("API de exemplo de uso de Spring Boot REST API")
                        .version("v1.0")
                        .termsOfService("Termo de uso: Uso livre e irrestrito, sem nenhuma garantia.")
                        .license(new io.swagger.v3.oas.models.info
                                .License()
                                .name("Licença - William Silva")
                                .url("https://github.com/unclWill"))
                        .contact(new Contact()
                                .name("William Silva")
                                .url("https://github.com/unclWill")
                                .email("william.silva@viannasempre.com.br")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }
}

