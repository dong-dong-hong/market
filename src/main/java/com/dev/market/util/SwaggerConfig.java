package com.dev.market.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Market API")
                .description("마켓 API 서버 입니다.")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("market")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dev.market")) // 패키지 기준 api 축출
                .paths(PathSelectors.any()) // 모든 경로의 api를 swagger에 표시
                .build()
                .apiInfo(apiInfo()); // 상단의 ApiInfo 메소드 호출
    }
}
