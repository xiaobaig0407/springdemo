package com.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    Song(String t, String a, String r ,String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle(){
        return title;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    public String toString(){
        return title;
    }

    @Override
    public int compareTo(Song s) {
       // return rating.compareTo(s.getRating());
        return this.rating.compareTo(s.getRating());
    }

}

public class Jukebox3 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args){
        new Jukebox3().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    public void getSongs(){
        try{
            File file = new File("song.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ( (line = reader.readLine() ) != null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void addSong(String lineto){
        String[] tokens = lineto.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
