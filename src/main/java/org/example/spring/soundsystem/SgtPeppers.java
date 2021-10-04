package org.example.spring.soundsystem;

import org.springframework.stereotype.Component;

//Listing 2.2 @CompactDist-annotated SgtPeppers implements CompactDisc
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
