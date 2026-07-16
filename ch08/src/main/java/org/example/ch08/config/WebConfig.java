package org.example.ch08.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /*

        CORS(Cross-Origin-Resource-sharing)
         - 웹 애플리케이션에서 다른 도매인의 리소스에 접근을 허용하지 않는 HTTP 정책
         - 기본적으로 보안상의 이유로 다른 도메인 리소스 접근은 금지
         - REST API 서비스를 하기 위해



     */






    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:5500", "http://127.0.0.1:5500")
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);


    }
}
