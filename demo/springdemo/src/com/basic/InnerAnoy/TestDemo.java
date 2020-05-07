package com.basic.InnerAnoy;

/**
 *
 * @package com.basic.InnerAnoy
 * @author baiyutao
 * @date 2020/4/25 下午8:23
 * @version 1.0
 */
interface Inter {
    void show1();

    void show2();
}

/**
 * 通常使用场景之一：
 * 当函数参数是接口类型时，而且接口中的方法不超过3个，可以用匿名内部类作为实际参数进行传递
 */

class Out5 {
    /*class Inner5 implements Inter{
        @Override
        public void show1() {

        }

        @Override
        public void show2() {

        }
    }*/
    public void method() {
        /*Inner5 in = new Inner5();
        in.show1();
        in.show2();*/
        Inter inp = new Inter() {
            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        };
        inp.show1();
        inp.show2();
    }
}


public class TestDemo {


    class Inner{

    }

    public static void main(String[] args) {
        Out5 out5 = new Out5();
        out5.method();
       // show(new InterImpl());
        show(new Inter() {
            @Override
            public void show1() {

            }

            @Override
            public void show2() {

            }
        });
        /*Error:(76, 9) java: 无法从静态上下文中引用非静态 变量 this
        new Inner();*/

    }

    public void method(){
        new Inner();
    }

    public static void show(Inter in){
        in.show2();
        in.show1();
    }
}

class InterImpl implements Inter{
    @Override
    public void show1() {

    }

    @Override
    public void show2() {

    }
}