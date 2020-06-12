package com.bean;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/4/29 上午12:27
 * @version 1.0
 */
public class Student3 extends Person3 {
    public Student3() {
    }

    public Student3(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student3{}"+this.getName()+":"+this.getAge();
    }
}
