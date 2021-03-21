package com.envaali.service;

import org.springframework.stereotype.Component;

@Component
public class StartupService {
    public StartupService(){}
    public void start(String[] string){
        System.out.println("Startup Service -- start methode ..");
    }
}
