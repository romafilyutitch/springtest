package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalPlayer = new MusicPlayer(music2);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        classicalPlayer.playMusic();
        context.close();
    }
}
