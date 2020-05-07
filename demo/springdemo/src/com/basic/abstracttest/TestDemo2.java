package com.basic.abstracttest;

/**
 *
 * @package com.basic.abstracttest
 * @author baiyutao
 * @date 2020/4/22 下午11:04
 * @version 1.0
 */

/**
 * 分析：
 * 在这个问题领域中，先找出涉及的对象通过名词提炼法
 * 程序员：
 *      属性：姓名，工号，薪水，
 *      行为：工作
 *
 * 经理：
 *      属性：姓名，工号，薪水，奖金
 *      行为：工作
 * 程序员和经理不存在着直接继承关系
 *
 * 但是程序员和经理却具有共性内容，可以进行抽取。因为他们都是公司的雇员
 *
 * 可以将程序员和经理进行抽取，建立体系
 */

abstract class Employe{
    private String name;
    private double pay;
    private String id;
    public Employe(String name, String id, double pay){
        System.out.println(this);
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    abstract void work();
}
class Coder extends Employe{
    public Coder(String name, String id, double pay){
        super(name, id, pay);
    }
    @Override
    public void work() {
        System.out.println(this.getName()+"..."+this.getId());
    }
}

class Manager extends Employe{
    private String bonus;
    public Manager(String name, String id, double pay,String bonus){
        super(name, id, pay);
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("code...");
    }
}


public class TestDemo2 {
    public static void main(String[] args) {
        Coder cod = new Coder("xiao","888",199.9);
        cod.work();
    }
}
