package com.basic.objtest;

/**
 *
 * @package com.basic.objtest
 * @author baiyutao
 * @date 2020/4/18 下午5:14
 * @version 1.0
 */
class Car{
    int num;
    String color;
    void run(){
        System.out.println(num+"..."+color);
    }
}

public class test {
    public static void main(String[] args) {
        Car c = new Car();
       // c.num = 4;
       // c.color = "red";
        c.run();
    }
}
