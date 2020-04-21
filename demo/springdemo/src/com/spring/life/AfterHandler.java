package com.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.life
 * @date 2020/4/8 下午11:08
 */

/**
 * 后置处理器
 * @author baiyutao
 */
public class AfterHandler implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前");
        Personoma personoma = (Personoma) bean;
        if (personoma.getSex().equals("男")){
            personoma.setName("zhangwu");
        } else {
            personoma.setName("zhaoming");
        }
        return personoma;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化后");
        return null;
    }
}
