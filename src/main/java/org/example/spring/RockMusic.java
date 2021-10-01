package org.example.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Winds Cries Mary";
    }
}
