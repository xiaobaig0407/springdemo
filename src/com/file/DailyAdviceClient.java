package com.file;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {

    public static void main(String[] args){
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }

    public void go(){
        try{
            Socket s = new Socket("127.0.0.1", 4242);
            //socket取得输入流，建立连接到socket的串流
            InputStreamReader streamReader =
                    new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("thod you shoid"+ advice);
            reader.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}


