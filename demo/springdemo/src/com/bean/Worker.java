package com.bean;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/5/7 下午10:35
 * @version 1.0
 */
public class Worker extends Person3 {
    public Worker(String name, int age) {
        super(name, age);
    }

    public Worker() {

    }

    @Override
    public String toString() {
        return "Worker{}"+this.getName()+":"+this.getAge();
    }
}
