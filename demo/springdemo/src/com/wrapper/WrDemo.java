package com.wrapper;

/**
 *
 * @package com.wrapper
 * @author baiyutao
 * @date 2020/5/13 上午1:17
 * @version 1.0
 */
public class WrDemo {
    public static void main(String[] args) {
        /**
         * 基本数据类型对象包装类
         * 为了方便操作基本数据类型值，将其封装成邓对象，在对象中定义了属性和行为丰富了该数据的操作
         * 用于描述该对象的类就称为基本数据类型对象包装类
         *1000 0000
         * byte         Byte
         * short        Short
         * int          Integer
         * long         Long
         * float        Float
         * double       Double
         * char         Character
         * boolean      Boolean
         *
         * 该包装对象主要用于基本类型和字符串之间的转换
         * 基本类型----》字符串
         *      1.基本类型数值+""
         *      2.用String类中的静态方法valueOf(基本类型数值）
         *      3.用Integer的静态方法valeOf(基本类型数值)
         *
         * 字符串----》基本类型
         *      1.使用包装类的静态方法   xxx parseXxx("xxx类型的字符串")
         *         int parseInt("intstring")
         *         long parseLong("longstring")
         *         boolean parseBoolean("booleanstring")
         *         只有Charater 没有parseCharater
         *      2.如果字符串被Inter进行对象的封装
         *        可使用另一个非静态的方法 ， intValue()
         *        将一个Integer对象转成基本数据类型值
         *
         *
         *
         */
        int num ;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.toBinaryString(127));
        Integer i = new Integer(6);
        int i1 = Integer.parseInt("232");
        System.out.println("----------------");
        System.out.println("123"+1);
        System.out.println(Integer.parseInt("123")+1);
       // System.out.println(Integer.parseInt("123abc")+1);
        if(Boolean.parseBoolean("true")){

        }
        Integer amp = new Integer("123");
        System.out.println(amp.intValue());
        System.out.println("-----进制");
        /**
         * 整数具备不同的进制体现
         * 十进制---》其它进制
         *      toBinaryString
         *      toOctalString
         *      toHexString
         * 其它进制---》十进制
         *      parseInt("string", radix)
         */
//        十进制---》其它进制
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toOctalString(60));
        System.out.println(Integer.toHexString(60));

        System.out.println(Integer.toString(60,17));
//        其它进制---》十进制
        System.out.println(Integer.parseInt("110", 2));
        System.out.println("---------");
        Integer a = new Integer("3");
        Integer b = new Integer(3);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
    }
}
