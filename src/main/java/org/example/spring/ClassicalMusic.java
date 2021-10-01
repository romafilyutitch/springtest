package org.example.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs;

    private ClassicalMusic() {
        this.songs = Arrays.asList("Moon sonata", "Hungarian Rhapsody", "Crackwell");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
