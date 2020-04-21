package com.spring.auto;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.ioc
 * @date 2020/4/9 下午3:27
 */
public class Emp {

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dept=" + dept +
                ", car=" + car +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DeptI getDept() {
        return dept;
    }

    public void setDept(DeptI dept) {
        this.dept = dept;
    }

    public CarFather getCar() {
        return car;
    }

    public void setCar(CarFather car) {
        this.car = car;
    }

    private Integer eid;
    private String  ename;
    private DeptI dept;
    private CarFather car;


}
