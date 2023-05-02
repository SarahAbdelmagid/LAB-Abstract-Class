abstract class MusicPlayer {
    abstract void playMusic(String song);
    abstract void saveMusic();
    abstract void stopMusic();
}

class AndroidMusicPlayer extends MusicPlayer {
    @Override
    void playMusic(String song) {
        System.out.println("Android müzik çalıyor: " + song);
    }

    @Override
    void saveMusic() {
        System.out.println("Android için müzik kaydedildi.");
    }

    @Override
    void stopMusic() {
        System.out.println("Android için müzik durduruldu.");
    }
}

class DesktopMusicPlayer extends MusicPlayer {
    @Override
    void playMusic(String song) {
        System.out.println("Masaüstü müzik çalıyor: " + song);
    }

    @Override
    void saveMusic() {
        System.out.println("Masaüstü için müzik kaydedildi.");
    }

    @Override
    void stopMusic() {
        System.out.println("Masaüstü için müzik durduruldu.");
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer androidPlayer = new AndroidMusicPlayer();
        androidPlayer.playMusic("sarki1");
        androidPlayer.saveMusic();
        androidPlayer.stopMusic();

        System.out.println();

        MusicPlayer desktopPlayer = new DesktopMusicPlayer();
        desktopPlayer.playMusic("sarki2");
        desktopPlayer.saveMusic();
        desktopPlayer.stopMusic();
    }
}
