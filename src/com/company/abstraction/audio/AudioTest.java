package com.company.abstraction.audio;

public class AudioTest {
    public static void main(String[] args) {
        Playable mp3 = new Mp3player();
        mp3.play();

        Playable wav = new Wavplayer();
        wav.play();

        // Lambda implementation
        Playable player = () -> {
            System.out.println("I am playing music");
        };

        Playable playing = new Playable() {
            @Override
            public void play() {

            }
        };

        player.play();
    }
}
