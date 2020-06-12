package com.exceptiontest;

/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/26 下午11:26
 * @version 1.0
 */

/**
 * 毕老师用电脑上课
 * 问题涉及2个对象，毕老师，电脑
 *
 * 分析其中问题，比如电脑蓝屏，冒烟
 */

/**
 * class NoaddException extends Exception{
 *
 * }
 * void addData(Data d) throws NoaddException{
 *     try{
 *         添加数据，出现异常，SqlException()
 *     }catch(SqlExeption e){
 *          //处理代码
 *         throw new NoaddException();
 *     }finally{
 *
 *     }
 * }
 */
class LanPingException extends Exception{
    public LanPingException(String message) {
        super(message);
    }
}

class MaoyanException extends Exception{
    public MaoyanException(String message) {
        super(message);
    }
}

class NoplainExeption extends Exception{
    public NoplainExeption(String message) {
        super(message);
    }
}

class Computer{
    private int status = 2;
    public void run() throws LanPingException,MaoyanException{
        if(status == 1){
            throw new LanPingException("电脑蓝屏");
        }
        if(status == 2){
            throw new MaoyanException("电脑冒烟");
        }
        System.out.println("电脑运行");
    }
    public void reset(){
        status = 0;
        System.out.println("电脑重启");
    }
}

class Teacher{
    private String  name;
    private Computer comp;

    public Teacher(String name) {
        this.name = name;
        comp = new Computer();
    }
    public void pret() throws NoplainExeption{
        try{
            comp.run();
            System.out.println(name+"讲课");
        }catch (LanPingException e){
            System.out.println(e.toString());
            comp.reset();
            pret();
        }catch (MaoyanException e){
            System.out.println(e.toString());
            test();
            //可以对电脑进行维修
//            throw e;
            throw new NoplainExeption("课程无法按时完成原因"+e.getMessage());
        }finally {

        }
    }
    public void test(){
        System.out.println("大家练习");
    }


}

public class DemoTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("bi老师");
        try{
            t.pret();
        }catch(NoplainExeption e){
            System.out.println(e.toString());
            System.out.println("换人");
        }
    }
}
