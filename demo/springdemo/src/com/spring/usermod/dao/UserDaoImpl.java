package com.spring.usermod.dao;

import org.springframework.stereotype.Repository;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.usermod.dao
 * @date 2020/4/9 下午5:04
 */

@Repository
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("userdaoimpl");
    }

    @Override
    public void addUser() {
        System.out.println("add success");
    }
}
