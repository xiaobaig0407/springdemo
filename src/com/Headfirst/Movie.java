package com.Headfirst;

class Movietest {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

public class Movie {
    public static void main(String[] args) {
        Movietest one = new Movietest();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movietest two = new Movietest();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movietest three = new Movietest();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}

              
              





