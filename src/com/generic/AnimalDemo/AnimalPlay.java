package com.generic.AnimalDemo;

import java.util.List;

public class AnimalPlay {
    public void play(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.play();
        }
    }
}
