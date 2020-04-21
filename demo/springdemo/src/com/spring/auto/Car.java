package com.spring.auto;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.ioc
 * @date 2020/4/9 下午3:28
 */
public class Car extends CarFather{
    private Integer cid;
    private String cname;

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
