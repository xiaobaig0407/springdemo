package com.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.factorybean
 * @date 2020/4/7 上午12:37
 */
public class MyFactory implements FactoryBean<Car> {
    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setBrand("baoma");
        car.setPrice(999.88);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
}
