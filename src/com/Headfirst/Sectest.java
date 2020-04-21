package com.Headfirst;

class TapeDeck {
    boolean canRecord = false;
    void playTape() { System.out.println("tape playing");
    }
    void recordTape() { System.out.println("tape recording");
    }
}
public class Sectest {
    public static void main(String [] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

    }
}