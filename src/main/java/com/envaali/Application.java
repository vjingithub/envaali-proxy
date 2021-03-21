package com.envaali;

import com.envaali.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication(scanBasePackages = {"com.envaali"})
public class Application extends SpringBootServletInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private StartupService startupService;

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        new SpringApplicationBuilder(Application.class).sources(Application.class).run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        startupService.start(Application.class.getAnnotation(SpringBootApplication.class).scanBasePackages());
    }

}
