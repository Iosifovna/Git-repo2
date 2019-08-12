
package ru.javabegin.training.fastjava2;

public class Cat extends Animal {

    public Cat(String name) {
        super("Кот " + name);
        this.eatLimit = 10;
    }

}