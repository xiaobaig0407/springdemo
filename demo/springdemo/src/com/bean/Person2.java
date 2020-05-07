package com.bean;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/4/29 上午12:27
 * @version 1.0
 */
public class Person2  {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
