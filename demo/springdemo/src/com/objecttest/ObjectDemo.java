package com.objecttest;

/**
 *
 * @package com.objecttest
 * @author baiyutao
 * @date 2020/5/14 上午10:58
 * @version 1.0
 */

class Person extends Object{
    private int age;

    public Person(int age) {
        this.age = age;
    }
    //比较person的age
//    一般都会覆盖此方法，根据对象特有的内容，建立判断对象是否相同的依据
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;*/
        if(!(o instanceof Person)) {
            throw new ClassCastException("type error");
        }
        Person per = (Person)o;
        System.out.println(per.age);
        System.out.println(this.age);
        return this.age == per.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "person:"+age;
    }
}
class Demo{
    private int age;

    public Demo(int age) {
        this.age = age;
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(20);
        Demo d = new Demo(20);
        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals(d));
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(p1.getClass());
        Class<? extends Person> aClass = p1.getClass();
        System.out.println(aClass.getName());
        System.out.println("-------------");
        System.out.println(p1.getClass().getName()+"@"+Integer.toHexString(p1.hashCode()));
        System.out.println(p1);
    }
}
