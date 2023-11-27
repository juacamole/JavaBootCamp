package org.example.Interfaces;

public class InterfacesMain {
    public static void main(String[] args){
        MediaController media = new MediaController();
        VideoPlayer video = new VideoPlayer();
        MusicPlayer music = new MusicPlayer();
        media.playMedia(video);
        media.playMedia(music);
    }
}
