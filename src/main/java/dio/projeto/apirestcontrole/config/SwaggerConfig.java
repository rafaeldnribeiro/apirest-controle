package dio.projeto.apirestcontrole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket projectApi(){
        return new Docket((DocumentationType.SWAGGER_2))
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.projeto.apirestcontrole"))
                .paths(PathSelectors.regex("/jornada.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "API REST Controle Projeto DIO",
                "Construindo um sistema de controle de ponto e acesso com Spring Boot.",
                "1.0",
                "Terms of Service",
                new Contact("Rafael Ribeiro", "https://www.linkedin.com/in/rafaeldnribeiro/",
                        "rafaeldnribeiro@hotmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/", new ArrayList<VendorExtension>()

        );

        return apiInfo;
    }

}