package com.col;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import com.col.Song;





/**
 * @author baiyutao
 * @version 1.0
 * @package com.col.am
 * @date 2020/3/18 上午11:28
 */

public class Jukebox6 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args){

        new Jukebox6().go();
    }

    class  ArtistComare implements Comparator<Song>{
        @Override
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        HashSet<Song> songHashSet = new HashSet<Song>();
        songHashSet.addAll(songList);
        System.out.println(songHashSet);
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


class Apple{
    String app = "";
    public Apple(String ap){
        app = ap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Apple apple = (Apple) o;
        return Objects.equals(app, apple.app);
    }

    @Override
    public int hashCode() {
        return 355;
    }
}