package com.spring.jdbctemplate;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.jdbctemplate
 * @date 2020/4/14 下午11:32
 */
public class Emp {
    @Override
    public String toString() {
        return "Emp{" +
                "userid=" + userid +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private Integer userid;
    private String avatar;




}
