package com.bean;

import java.util.Objects;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/5/7 上午12:03
 * @version 1.0
 */
public class Person3 implements Comparable<Person3>{
    private String name;
    private  int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Person3 o) {
//        Person3 o1 = (Person3) o;
        int temp = this.age-o.age;
        return temp==0?this.name.compareTo(o.name):temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person3 = (Person3) o;
        return age == person3.age &&
                Objects.equals(name, person3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
