package com.interface1.test;

import com.interface1.Balloon;
import com.interface1.Bird;
import com.interface1.IFly;
import com.interface1.Plane;


public class Test {
    public static void main(String[] args) {
        IFly plane = new Plane();
        IFly balloon = new Balloon();
        IFly bird = new Bird();

        plane.fly();
        balloon.fly();
        bird.fly();
    }
}
