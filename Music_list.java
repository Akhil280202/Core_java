import java.util.*;
class MusicLibrary {
    private ArrayList < Song > songs;
    public MusicLibrary() {
        songs = new ArrayList < Song > ();
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public ArrayList < Song > getSongs() {
        return songs;
    }
    public void playRandomSong() {
        int size = songs.size();
        if (size == 0) {
            System.out.println("No songs in the library.");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(size);
        System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
    }
}
class Song {
    private String title;
    private String artist;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
}
public class Music_list {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong(new Song("vcdrtgv", "bvfdetayh"));
        library.addSong(new Song("sjag3bvj", "adhwrthbz"));
        library.addSong(new Song("qwertyui", "poiuytrewq"));
        library.addSong(new Song("asdfghjkl", "lkjhgfdsa"));
        library.addSong(new Song("zxcvbnm", "mnbvcxz"));
        library.addSong(new Song("zxcfghiop", "poiugfdsz"));
        library.addSong(new Song("qwerfv nmkiuytc", "gfdsertyujbvc"));
        System.out.println("All songs:");
        for (Song song: library.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
        System.out.println("Playing Random Song");
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
    }
}
