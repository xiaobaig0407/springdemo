package com.file;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int p, String t, String[] w){
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower(){
        return power;
    }

    public String getType(){
        return type;
    }


    public String getWeapons(){
        String we_list = "";
        for(int i=0; i<weapons.length; i++){
            we_list += weapons[i]+"";
        }

        return we_list;
    }


}
