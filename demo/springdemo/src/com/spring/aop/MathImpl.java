package com.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class MathImpl implements MathI {

    /**
     * name : xiaoming
     */

    private String name;

    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("get result "+result);
        return result;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

