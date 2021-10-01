package org.example.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs;

    public RockMusic() {
        this.songs = Arrays.asList("Winds Cries Mary", "Yesterday", "Like a rolling stone");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
