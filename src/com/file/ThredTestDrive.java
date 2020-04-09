package com.file;

import java.io.*;
import java.lang.*;

class MyRunnable implements Runnable{
    public void run(){
        go();
    }
    public void go(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }
    public void doMore(){
        System.out.println("top o222");
    }
}

public class ThredTestDrive {
    public static void main(String[] args){
        Runnable threadjob = new MyRunnable();
        Thread myThread = new Thread(threadjob);
        myThread.start();
        System.out.println("back in main");
    }
}
