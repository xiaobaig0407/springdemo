package com.spring.life;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.life
 * @date 2020/4/8 下午5:56
 */
public class Personoma {
    private Integer id;
    private String sex;
    private String name;

    public Integer getId() {
        return id;
    }

    public Personoma() {
        super();
        System.out.println("one:创建对象");
    }

    public void setId(Integer id) {
        System.out.println("two : 依赖注入");
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "four: 进行Person{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("three:初始化");
    }

    public void destroy(){
        System.out.println("five: 销毁");
    }
}
