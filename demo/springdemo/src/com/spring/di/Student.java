package com.spring.di;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.di
 * @date 2020/4/6 下午3:06
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                ", agem=" + agem +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getAgem() {
        return agem;
    }

    public void setAgem(Integer agem) {
        this.agem = agem;
    }

    private Integer agem;
    private String sex;
    private Double score;

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(Integer id, String name, Integer age, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
        super();
    }

    public Student(Integer id, String name, Integer age, Integer agem, String sex, Double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        agem = agem;
        this.sex = sex;
        this.score = score;
    }

    public Student(Integer id, String name, Integer age, String sex, Double score) {
        this.id = id;
        this.name = name;
        agem  = age;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }
}
