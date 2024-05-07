//package com.javaback.project.minichat.errors;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        // Ensure static resources are correctly mapped, avoiding overlap with API routes
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/static/");
//    }
//
//    // Ensure that DispatcherServlet is configured to ignore requests to /login
//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        configurer.addPathPrefix("/api", c -> c.isAnnotationPresent(RestController.class));
//    }
//}
//

