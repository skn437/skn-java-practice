package com.main.musiclibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract interface MusicLibraryInterface {
  public void addSong(Song song);

  public void removeSong(Song song);

  public void getSongs();

  public void playRandomSong();
}

public class MusicLibrary implements MusicLibraryInterface {

  private List<Song> songs;

  public MusicLibrary() {
    songs = new ArrayList<Song>();
  }

  public void addSong(Song song) {
    this.songs.add(song);
  }

  public void removeSong(Song song) {
    this.songs.remove(song);
  }

  public void getSongs() {
    System.out.printf("Songs In The Library: %s\n", this.songs.toString());
  }

  public void playRandomSong() {
    int size = this.songs.size();

    if (size == 0) {
      System.out.printf("No song to play in the library!\n");
      return;
    }

    Random random = new Random();
    int index = random.nextInt(size);

    System.out.printf(
      "Now playing `%s` by `%s`\n",
      this.songs.get(index).getTitle(),
      this.songs.get(index).getAuthor()
    );
  }
}
