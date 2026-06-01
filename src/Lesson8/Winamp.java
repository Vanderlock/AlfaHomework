package Lesson8;

public class Winamp {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Треки в тачилу");

        playlist.addSong("Linkin Park");
        playlist.getSongByIndex(0);
        playlist.deleteSong(0);
        playlist.addSong("Бутырка");
        playlist.addSong("Александр Солодуха");
        playlist.getSongByIndex(1);
        playlist.updateSong(0, "Юрий Лоза");
        System.out.println("\n" + playlist);


    }

}
