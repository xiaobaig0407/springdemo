package com.spring.usermod.service;

import com.spring.usermod.dao.UserDao;
import com.spring.usermod.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.usermod.service
 * @date 2020/4/9 下午5:03
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier(value = "userDaoMybatisImpl")
    private UserDao userDao;

    public UserServiceImpl(){
        System.out.println("userservice");
        System.out.println(userDao);
    }

    @Override
    public void addUser() {
        System.out.println(userDao);
        userDao.addUser();
    }
}
