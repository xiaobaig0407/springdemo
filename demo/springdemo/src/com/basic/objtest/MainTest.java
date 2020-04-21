package com.basic.objtest;

/**
 *
 * @package com.basic.objtest
 * @author baiyutao
 * @date 2020/4/20 上午12:36
 * @version 1.0
 */

/**
 * 主函数特殊之处
 * 1.格式是固定的
 * 2.被jvm所识别和调用
 *
 * public:因为权限必须是最大的。
 * static:虚拟机在调主函数是不需要对象，直接用主函数所属类名即可
 *      java MainTest.main();
 * void:主函数没有具体的返回值
 * main:函数名，不是关键字，只是一个jvm识别的固定的名字
 * String[] args:这是主函数的参数列表 ，是一个数组类型的参数 ，而且元素都是字符串类型
 *
 *
 *
 */
public class MainTest {
    public static void main(String[] args) { //new String[0]
        System.out.println(args);//[Ljava.lang.String;@6acbcfc0
        System.out.println(args.length);
        System.out.println(args[0]);
    }
}
