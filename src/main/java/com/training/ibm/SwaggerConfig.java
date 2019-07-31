/**
 * 
 */
package com.training.ibm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private static final String SWAGGER_API_VERSION = "1.0";
	private static final String title = "Training IBM REST API " ;
	private static final String description = "Web Services for IBM Training" ;
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(title)
				.description(description)
				.version(SWAGGER_API_VERSION)
				.build();
	}

	
	@Bean
	public Docket wstrainingApi() {
		return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(apiInfo())
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.training.ibm.controllers"))
			.paths(PathSelectors.any())
			.build()
			.tags(new Tag("ConsultInfo", "Servicio de consulta de informacion"));                                          
    }

}
