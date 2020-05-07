package com.basic.InnerAnoy;

/**
 *
 * @package com.basic.InnerAnoy
 * @author baiyutao
 * @date 2020/4/25 下午11:02
 * @version 1.0
 */

class X{
    Y y = new Y();
    public X(){
        System.out.println("X");
    }
}

class Y{
    public Y(){
        System.out.println("Y");
    }
}

class M{
    public M(){
        System.out.println("M");
    }
}

public class Testx extends X{
    M m = new M();
    public Testx(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Testx();
    }
}
