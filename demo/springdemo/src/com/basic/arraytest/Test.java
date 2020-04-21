package com.basic.arraytest;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.basic.arraytest
 * @date 2020/4/18 上午10:39
 */

/**
 * 内存划分
 * 1. 寄存器
 * 2. 本地方法区（所在系统相关）
 * 3. 方法区
 * 4. 栈内存
 *      存储的都是局部变量（定义在方法中的变量）作用域在方法里
 *      而且变量所属的作用域一旦结束，该变量就会自动释放。
 *
 * 5. 堆内存
 * 垃圾回收
 * 存实体存储多个数据的地方,arr引用堆内存当中的一个实体
 *      存储的是数组和对象（其实数组就是对象） 凡是new建立的都在堆中。多个引用变量可以指向同一个实体
 *      数组是对象，所以默认值为null ,   默认值为null
 *      特点：
 *      1.每一个实体都有首地址值
 *      2.堆内存中的每一个变量都有默认初始化值，根据类型不同而不同。整数是0，小数0.0或者0.0f,
 *        bollen false, char "\u0000",
 *      3.垃圾回收机制
 *
 */

public class Test {
    public static void main(String[] args) {

        {//局部代码块。 限定局部变量的生命周期。
            int age = 10;
        }
        int i = 0;
        for (i = 0; i < 3; i++) {

        }
        int[][] arr = new int[3][2];
        int[] amp = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][1]);
        System.out.println(amp); //[I@3feba861   @左边是实体类型 @右边是实体hash值
        System.out.println(i);
    }
}
