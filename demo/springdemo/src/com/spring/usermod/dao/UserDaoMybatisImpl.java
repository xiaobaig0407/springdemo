package com.spring.usermod.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.usermod.dao
 * @date 2020/4/10 上午10:33
 */

@Repository
public class UserDaoMybatisImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("userdaomybaticimpl:add success");
    }
}
