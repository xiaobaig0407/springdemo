package com.file;


import java.io.*;

import com.file.GameCharacter;

public class GameServerTest {
    int height = 10;
    public static void main(String[] args){
        GameCharacter one = new GameCharacter(50, "elf", new String[]{"bow"
                , "sword", "dust"});
        GameCharacter three = new GameCharacter(120, "magician", new String[]
                {"spells", "invisible"});
        GameCharacter two = new GameCharacter(200, "troll", new String[]
                {"bare hand", "big ax"});


        try{
//            创建file对象（字节写入文件），创建object流把对象打成流送入fiLe
            ObjectOutputStream os =
                    new ObjectOutputStream(new FileOutputStream("game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }


        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "game.ser"));
            GameCharacter oneRes = (GameCharacter)is.readObject();
            GameCharacter twoRes = (GameCharacter)is.readObject();
            GameCharacter threeRes = (GameCharacter)is.readObject();

            System.out.println("one type "+oneRes.getType());
            System.out.println("two type "+twoRes.getType());
            System.out.println("three type "+threeRes.getType());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}

