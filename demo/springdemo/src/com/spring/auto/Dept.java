package com.spring.auto;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.ioc
 * @date 2020/4/9 下午3:29
 */
public class Dept implements DeptI{
    private Integer did;
    private String dname;

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
