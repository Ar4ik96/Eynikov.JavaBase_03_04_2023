package ua.hillel.eynicov.lesson13;

abstract class MusicStyles {
    public abstract void playMusic();
}

class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing pop music...");
    }
}

class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing rock music...");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing classic music...");
    }
}