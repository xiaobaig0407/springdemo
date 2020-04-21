package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class ReadFile {
    public static void main(String[] args){
        try{
            File myFile = new File("mytext.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while(( line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("aaaaaa");
        String toTest = "what is blue/green";
        String[] result = toTest.split("/");
        System.out.println(result);

        for(String token:result){
           // System.out.println(token);
        }

    }
}
