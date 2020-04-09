package com.file;

import java.io.*;

public class WriteFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("foo.json");
            writer.write("hello world");
            writer.close();
        }catch (IOException ex){
            ex.printStackTrace();
            System.out.println("kkkka");
        }

    }
}
