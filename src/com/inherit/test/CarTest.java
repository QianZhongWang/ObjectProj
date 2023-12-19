package com.inherit.test;

import com.inherit.car.Car;
import com.inherit.car.HomeCar;
import com.inherit.car.Taxi;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("红色", "张三");
        Car car2 = new Car("红色", "张三");
        car1.use();
        System.out.println("car1和car2的比较：" + car1.equals(car2));

        System.out.println("-------------------------------------");

        Taxi taxi = new Taxi("蓝色", "李四", "长生公司");

        taxi.ride();
        taxi.use();
        System.out.println(taxi.toString());


        System.out.println("-------------------------------------");

        HomeCar homeCar = new HomeCar("白色", "王五", 4);
        homeCar.display();
        homeCar.display(5);


    }
}
