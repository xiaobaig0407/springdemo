package com.col;

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

    public boolean equals(Object aSong){
       Song s = (Song) aSong;
       return this.getTitle().equals(s.getTitle());

    }

    public int hashCode(){
        return title.hashCode();

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
    public String getArtist(){
        return artist;
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
