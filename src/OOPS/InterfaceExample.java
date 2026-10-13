package OOPS;

interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, Phone, MusicPlayer {
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void makeCall() {
        System.out.println("Making a call");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.takePhoto();
        s.makeCall();
        s.playMusic();
    }
}