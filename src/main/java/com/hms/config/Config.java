package com.hms.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
//@ConditionalOnProperty(name = "swagger.enabled",havingValue = "true", matchIfMissing = false)
@EnableEncryptableProperties
public class Config {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

 @Bean
 public OpenAPI customOpenAPI() {

     final String securitySchemeName = "bearerAuth";
     OpenAPI openAPI = new OpenAPI().info(
             new Info().version("version").title("title")
                     .description("description")
                     .contact(new io.swagger.v3.oas.models.info.Contact().name("name").url("link").email("email")));

     openAPI.addSecurityItem(new SecurityRequirement()
                     .addList(securitySchemeName))
             .components(new Components()
                     .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                             .name(securitySchemeName)
                             .type(SecurityScheme.Type.HTTP)
                             .scheme("bearer")
                             .bearerFormat("JWT")));

     return openAPI;
 }

}
