package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = musicPlayer1 == musicPlayer2;
        System.out.println(comparison);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);
        musicPlayer1.setVolume(10);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
