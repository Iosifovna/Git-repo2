package ru.javabegin.training.fastjava2;

import javax.swing.plaf.PanelUI;

public abstract class Animal {
    public int food;
    protected String name;
    protected int eatLimit =0;

    public Animal(){ this.name = "Безымянный";}

    public Animal(String name){this.name = name;}

    public int getEatLimit(){
        return eatLimit;
    }

    public void eat(int food){
        if(food > eatLimit){
            System.out.println(this.name + " наелся=)");
        }
        else{
            System.out.println(this.name + " не наелся=( СЛИШКОМ МАЛО ЕДЫ! ");
        }
    }

}
