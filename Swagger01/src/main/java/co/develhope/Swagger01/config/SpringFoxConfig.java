package co.develhope.Swagger01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "Swagger01",
                "Swagger01",
                "1.0.0",
                "https://en.wikipedia.org/wiki/MIT_License",
                new Contact("test", "https://develhope.co", "test.doe@develhope.co"),
                "MIT",
                "https://en.wikipedia.org/wiki/MIT_License",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("co.develhope.Swagger01"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo)

                .tags(
                        new Tag("name-controller", "The name controller")
                )
                ;
    }

}
