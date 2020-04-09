package com.file;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;




public class Box implements Serializable {
    private int width;
    private int height;

    Duck a = new Duck();

    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }

    public static void main(String[] args){

        Box mybox = new Box();
        mybox.setWidth(50);
        mybox.setHeight(20);

        try{
            FileOutputStream fs = new FileOutputStream("./foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(mybox);
            os.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
class Duck {

}