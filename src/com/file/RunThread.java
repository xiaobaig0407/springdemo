package com.file;


public class RunThread implements Runnable{
    public static void main(String[] args){
        RunThread runner = new RunThread();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("alpha thread");
        beta.setName("beta thread");
        alpha.start();
        beta.start();
    }
    public void run(){
        for(int i=0; i<3; i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        }
    }
}
