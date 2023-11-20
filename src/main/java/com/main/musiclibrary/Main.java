package com.main.musiclibrary;

public class Main {

  public static void main(String[] args) {
    Song song1 = new Song("Sunn Raha Hai Na Tu", "Shreya Ghoshal");
    Song song2 = new Song("Tum Hi Ho", "Arijit Singh");
    Song song3 = new Song("Aap Ki Naazron Ne Samjha", "Shreya Ghoshal");
    Song song4 = new Song("Manike Maage Hithe", "Yohani");

    MusicLibrary library = new MusicLibrary();

    library.addSong(song1);
    library.addSong(song2);
    library.addSong(song3);
    library.addSong(song4);

    library.playRandomSong();

    library.getSongs();
  }
}
