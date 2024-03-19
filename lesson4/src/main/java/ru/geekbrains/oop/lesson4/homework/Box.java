package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;


    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            System.out.println("Нельзя пересыпать фрукты в ту же самую коробку");
        } else {
            for (T fruit : fruits) {
                anotherBox.addFruit(fruit);
            }
            fruits.clear();
        }
    }

}

