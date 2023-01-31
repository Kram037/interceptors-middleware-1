package co.develhope.interceptorsmiddleware1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InterceptorsMiddleware1Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorsMiddleware1Application.class, args);
    }

}
