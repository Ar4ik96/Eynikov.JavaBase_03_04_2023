package ua.hillel.eynicov.lesson13;

public class Main {
    public static void main(String[] args) {
        MusicStyles popMusic = new PopMusic();
        MusicStyles rockMusic = new RockMusic();
        MusicStyles classicMusic = new ClassicMusic();

        MusicStyles[] musicStyles = {popMusic, rockMusic, classicMusic};
        for (MusicStyles music : musicStyles) {
            music.playMusic();
        }

    }
}
