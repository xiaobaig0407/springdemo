package com.bean;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/4/29 上午12:27
 * @version 1.0
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if (!(o instanceof Person)) {
            throw new ClassCastException("类型错误");
        }
        Person person = (Person) o;
        System.out.println(this+"equals...obj");
        return this.name.equals(person.name) && this.age == person.age;
    }

    @Override
    public int hashCode() {
        System.out.println(this+"...hashcode");
        return this.name.hashCode()+age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(!(o instanceof Person)){
            throw new ClassCastException("");
        }
        Person p = (Person) o;
        if(this.age > p.age){
            return 1;
        }
        if(this.age < p.age){
            return -1;
        }
        return 0;

    }
}
