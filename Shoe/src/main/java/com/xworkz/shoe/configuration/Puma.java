package com.xworkz.shoe.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Puma extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public Puma(){
        System.out.println("no arg const in Puma");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        String[] urls={"/"};
        System.out.println("configure url for DispatcherServlet");
        return urls;
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Enable static resource handling by server");
        configurer.enable();
    }
}
