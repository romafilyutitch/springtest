package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;
    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    public String playMusic(Genre genre) {
        List<String> songs = defineListByGenre(genre);
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }

    private List<String> defineListByGenre(Genre genre) {
        switch (genre) {
            case CLASSICAL: return music1.getSongs();
            case ROCK: return music2.getSongs();
            default: throw new EnumConstantNotPresentException(genre.getClass(), genre.name());
        }
    }
}