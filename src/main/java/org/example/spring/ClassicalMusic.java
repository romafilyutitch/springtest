package org.example.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;


public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungrian Rapsody";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }
}
