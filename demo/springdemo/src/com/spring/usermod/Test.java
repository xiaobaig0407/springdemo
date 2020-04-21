package com.spring.usermod;

import com.spring.usermod.controller.UserController;
import com.spring.usermod.dao.UserDao;
import com.spring.usermod.dao.UserDaoImpl;
import com.spring.usermod.service.UserService;
import com.spring.usermod.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.usermod
 * @date 2020/4/9 下午5:15
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println(userController);
        System.out.println(1111);
      /*  UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        UserService userService = userServiceImpl;
        System.out.println(userService);
        System.out.println(2222);
        UserDaoImpl userDaoImpl = applicationContext.getBean("userDaoImpl", UserDaoImpl.class);
        UserDao userDao =  userDaoImpl;
        System.out.println(userDao);
        System.out.println(33333);*/
        userController.addUser();
    }
}

