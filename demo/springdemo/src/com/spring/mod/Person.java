package com.spring.mod;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.mod
 * @date 2020/4/5 下午10:29
 */
public class Person {
    private Integer id;
    private String  name;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(){
        System.out.println("hello moto");
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(){

    }
}
