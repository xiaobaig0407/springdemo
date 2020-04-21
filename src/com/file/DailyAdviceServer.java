package com.file;

import java.io.*;
import java.net.*;
public class DailyAdviceServer {
    String[] adviceList = {"take small bites","go for hikeing"};

    public void go(){
        try{
            //创建服务端监听端口
            ServerSocket serverSock = new ServerSocket(4242);
            while(true){
                Socket sock = serverSock.accept();
                //字符数据和字节转换的桥梁
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    private String getAdvice(){
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}
