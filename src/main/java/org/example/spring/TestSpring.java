package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.playMusic(Genre.ROCK));
        System.out.println(player.playMusic(Genre.ROCK));
        System.out.println(player.playMusic(Genre.ROCK));
        context.close();
    }
}
