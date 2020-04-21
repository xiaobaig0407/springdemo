package com.basic.extendstest;

/**
 *
 * @package com.basic.extendstest
 * @author baiyutao
 * @date 2020/4/21 上午12:01
 * @version 1.0
 */

/**
 * 子类先加载父类
 *
 * 方法区是代码 ，运算区是栈堆,成员变量一定要存入在堆里面
 */

class Fut{
    int num = 4;

}
class Zit extends Fut{
    int num = 5;
    void show(){
        System.out.println(this.num+"...."+super.num);
    }

}


public class TestDemo2 {
    public static void main(String[] args) {
        Zit z = new Zit();
        z.show();
    }
}
