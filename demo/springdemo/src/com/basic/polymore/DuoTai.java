package com.basic.polymore;

/**
 *
 * @package com.basic.polymore
 * @author baiyutao
 * @date 2020/4/23 下午6:36
 * @version 1.0
 */

/**
 * 对象的多态性
 *
 * 猫这类事物既具备猫的特性，又具备着动物的形态，这就是对象的多态性
 *
 * 简单说就是一个对象对应着不同的类型
 *
 * 多态在代码中的体现：
 *      父类或者接口的引用指向子类对象
 *
 * 多态好处：
 *         提高了代码的扩展性，前期定义的代码可以使用后期的内容
 * 多态弊端：
 *         前期定义的内容不能使用（调用）后期子类的特有内容
 *
 * 多态的前提：
 *          1.必须有关系，继承或者实现
 *          2.要有覆盖，
 */
abstract class Animal{
    public int num = 99;
    abstract void eat();
}

class Cat extends  Animal{
    public int num = 18;
    @Override
    public void eat(){
        System.out.println("eat fish");
    }
    public void catchMouse(){
        System.out.println("zhua shu");
    }
}

class ZaDog extends Dog{
    @Override
    public void eat(){
        System.out.println("zangao bone");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("ken bone");
    }
    public void watchhome(){
        System.out.println("kan jia");
    }
}
class Pig extends Animal{
    public void eat(){
        System.out.println("gong");
    }
    public void gong(){
        System.out.println("gongdi");
    }
}


public class DuoTai {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //一个对象两种形态
        /**
         * 自动类型提升，猫对象提升为动物类型。但是特有功能无法访问
         * 作用是限制对特有功能的访问
         * 专业讲：向上转型，将子类型隐藏，就不能使用子类的特有方法
         */
        Animal animal = new Cat();
        animal.eat();
        /**
         * 如果还想用具体动物猫的特有功能。可以将该对象进行向下转型
         * 向下转型作用是为了使用子类特有的方法
         *
         * 注意：对于转型，自始至终都是子类对象在做着类型的变化
         */
        Cat mb = (Cat)animal;
        mb.catchMouse();
        Cat c = new Cat();

        //
        //Animal a1 = new Dog();
        //Cat c1 = (Cat) a1; //classCastException
        Dog d = new Dog();
        ZaDog zdog = new ZaDog();
        method(c);
    }

    public static void method(Animal a){
        a.eat();
        //instanceof :用于判断对象的具体类型,只能用于引用数据类型判断，后面可以跟接口或者类
        if(a instanceof  Cat){
            //通常在向下转型前用于健壮性的判断
            Cat mp = (Cat)a;
            mp.catchMouse();
        }else if (a instanceof  Dog){
            Dog md  = (Dog)a;
            md.watchhome();
        }

        System.out.println(a instanceof ZaDog);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Dog);
        Cat mp = (Cat)a;

        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Animal);
        System.out.println(mp instanceof Cat);
        System.out.println(a);
        System.out.println(mp);
        mp.catchMouse();
    }
}

