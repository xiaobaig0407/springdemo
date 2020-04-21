package com.spring.factorybean;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.factorybean
 * @date 2020/4/7 上午12:36
 */
public class Car {
    private String brand;
    private Double price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
