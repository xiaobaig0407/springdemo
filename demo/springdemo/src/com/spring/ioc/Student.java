package com.spring.ioc;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.ioc
 * @date 2020/4/8 下午4:52
 */
public class Student {
    private Integer sid;
    private String name;



    public Student(){
        super();
        System.out.println("student construc");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}
