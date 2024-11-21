package com.xworkz.penguin.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    public SpringWebInit() {
        System.out.println("no arg const in SpringWebInit");
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
        String[] urls = {"/"};
        System.out.println("configured urls for DispatcherServlet");
        return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Enable static resources handling by server");
        configurer.enable();
    }
}
