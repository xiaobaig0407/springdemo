package com.exceptiontest;

/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/28 下午10:20
 * @version 1.0
 */

/**
 * 异常的注意事项
 * 1.子类在覆盖父类方法时，父类的方法如果抛出了异常，那么子类的方法只能抛出父类的异常或者该异常的子类
 * 2.如果父类抛出多个异常，那么子类只能抛出父类异常的子类或者全集。
 *
 * 简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集
 * 注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛,就只能try
 *
 * interface Inter{
 *     void funciton()
 * }
 *
 * class D implements Inter{
 *     public void funciotn()throw Excepton
 * }
 */
class AException extends Exception{

}
class BException extends AException{

}
class CException extends Exception{

}
class Fu{
    void show() throws AException{

    }
}
class Zi extends Fu{
    @Override
    void show() throws BException{

    }
}

class TestMe{
    void method(Fu f){ // Fu f = new Zi();多态
        try{
            f.show();
        } catch (AException e) {
            e.printStackTrace();
        }
    }
}

public class ExcepDemo6 {
    public static void main(String[] args) {
        TestMe test = new TestMe();
        test.method(new Fu());
        test.method(new Zi());
    }
}
