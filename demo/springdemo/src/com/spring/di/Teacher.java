package com.spring.di;

import org.w3c.dom.ls.LSException;

import java.util.List;
import java.util.Map;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.di
 * @date 2020/4/6 下午4:09
 */
public class Teacher {
    private Integer tid;
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", bossMap=" + bossMap +
                ", students=" + students +
                ", cls=" + cls +
                '}';
    }

    public Map<String, String> getBossMap() {
        return bossMap;
    }

    public void setBossMap(Map<String, String> bossMap) {
        this.bossMap = bossMap;
    }

    private Map<String, String> bossMap;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students;

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    private List<String> cls;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
