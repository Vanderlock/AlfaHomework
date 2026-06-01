package Lesson8;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<String> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistName='" + playlistName + '\'' +
                ", songs=" + songs +
                '}';
    }

    public void addSong(String songName) {
        songs.add(songName);
        System.out.println("Добавлена песня: " + songName);
    }

    public void deleteSong(int songIndex) {
        if (songIndex >= 0 && songIndex < songs.size()) {
            String deletedSong = songs.remove(songIndex);
            System.out.println("Удалена песня: " + deletedSong + " (под индексом " + songIndex + ")");
        } else {
            System.out.println("Индекс " + songIndex + " не существует");
        }
    }

    public void updateSong(int songIndex, String songName) {
        if (songIndex >= 0 && songIndex < songs.size()) {
            String oldSong = songs.set(songIndex, songName);
            System.out.println("Обновлена песня: " + oldSong + " (под индексом " + songIndex + ")");
            System.out.println("Теперь там песня: " + songName + " (под индексом " + songIndex + ")");
        } else System.out.println("Индекс " + songIndex + " не существует");
    }

    public String getSongByIndex(int songIndex) {
        if (songIndex >= 0 && songIndex < songs.size()) {
            String song = songs.get(songIndex);
            System.out.println("Получена песня: " + song + " (под индексом " + songIndex + ")");
            return song;
        } else {
            System.out.println("Индекс " + songIndex + " не существует");
        }
        return null;


    }


}
