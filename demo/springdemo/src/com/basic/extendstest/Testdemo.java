package com.basic.extendstest;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.basic.extendstest
 * @date 2020/4/17 下午11:54
 */

/**
 * defalut:只存在于同包中
 * private：只在本类中有效
 * 在子父类中的成员体现
 * 1.成员变量
 * 2.成员函数
 * 3.构造函数
 *
 * 调用this变量时，方法存在于哪个类中，就调用该类的变量
 */

/**
 * 当本类的成员和局部变量同名用this区分。
 * 当子父类中的成员变量同名用super区分父类
 *
 *this和super的用法很相似
 *
 *this:代表一个本类对象的引用。
 * super:代表一个父类空间。  访问父类中内容
 */
class Fu{
    int numb1 = 4;
    int numb2 = 80;

}
class Son extends Fu{
     int numb2 = 9;
    void show(){
        System.out.println(numb2+"...."+this.numb2+"。。。"+super.numb2);
    }

}


