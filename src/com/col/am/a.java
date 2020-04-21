package com.col.am;

import java.sql.Statement;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.col.am
 * @date 2020/3/18 上午11:28
 */
public class a {
    int[] scores = {80,90,87,68,99,100,79,96};

    public int[] getScores() {
        System.out.println(scores);
        System.out.println("bbb");
        return scores;
    }

    public static void main(String[] args){
        int[] arr = new  int[5];
        a am = new a();
        am.getScores();
    }
}


