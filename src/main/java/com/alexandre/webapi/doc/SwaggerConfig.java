package com.alexandre.webapi.doc;

import java.util.Arrays;
import java.util.HashSet;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rest API - Controle de Usuários")
                        .description("Primeiros passos com Testes e documentação de API com Swagger")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://www.seusite.com.br")
                        )
                ).externalDocs(
                        new ExternalDocumentation()
                                .description("Alexandre Borges")
                                .url("http://www.seusite.com.br"));
    }

}
