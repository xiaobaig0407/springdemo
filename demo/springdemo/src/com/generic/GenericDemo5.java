package com.generic;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 上午11:49
 * @version 1.0
 */
public class GenericDemo5 {
    public static void main(String[] args) {
        InterImpl in = new InterImpl();
        in.show("abc");
        InterImpl2<Integer> in2 = new InterImpl2<Integer>();
        in2.show(4);

    }
}

//泛型接口，将泛型定义在接口上
interface Inter<T>{
    public void show(T t);
}

class InterImpl implements Inter<String>{
    @Override
    public void show(String str){

    }
}

class InterImpl2<Q> implements Inter<Q>{
    public void show(Q t){
        System.out.println("sho:"+t);
    }
}
