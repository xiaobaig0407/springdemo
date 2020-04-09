package com.file;

import java.io.*;



public class Threadtest {
    public static void main(String[] args){
        Runnable thredjob = new MyRunnable();
        Thread myThread = new Thread(thredjob);
        myThread.start();
        System.out.println("backin");
    }
}

