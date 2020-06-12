package com.bean;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/4/29 上午12:27
 * @version 1.0
 */
public class Student extends Person{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }


}
