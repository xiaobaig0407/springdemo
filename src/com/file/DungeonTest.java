package com.file;

import java.io.Serializable;
import java.io.*;

class DungeonGame implements Serializable{
    private static final long serialVersionUID = 5171842226235644425L;
    public int x = 3;
    //
    transient long y = 4;
    private short z = 5;

    public int getX(){
        return x;
    }
    public short getZ(){
        return z;
    }
    public long getY(){
        return y;
    }
}


public class DungeonTest {
    public static void main(String[] args){
        DungeonGame d = new DungeonGame();
        System.out.println(d.getX()+d.getY()+d.getZ());
        try{

            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            FileInputStream fis =  new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame)ois.readObject();
            System.out.println(d.getX()+d.getY()+d.getZ());
            ois.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }



    }
}
