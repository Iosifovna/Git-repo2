package ru.javabegin.training.fastjava2;
import java.security.PublicKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal[] arrayOfAnimals = new Animal[3];

        arrayOfAnimals[0] = new Cat("Барсик");
        arrayOfAnimals[1] = new Cat("Мурзик");
        arrayOfAnimals[2] = new SuperCat("Васька", 20);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество кусков курицы в миске: ");
        int food = in.nextInt();

        if (food > 0 && food > arrayOfAnimals[0].getEatLimit()) {
            arrayOfAnimals[0].eat(food);
        }
        else {
            System.out.println("Слишком мало еды, коты не наелись");
            Scanner on = new Scanner(System.in);
            System.out.print("Добвьте еще курицы: ");
            int foodplus = on.nextInt() + food;
            if (foodplus > 0 && foodplus > arrayOfAnimals[0].getEatLimit()) {
                arrayOfAnimals[0].eat(foodplus);
            } else {
                System.out.println("Слишком мало еды, коты не наелись");
            }


            if ((foodplus - arrayOfAnimals[0].getEatLimit()) > arrayOfAnimals[0].getEatLimit()) {
                int foodplus2 = food - arrayOfAnimals[0].getEatLimit();
                arrayOfAnimals[1].eat(foodplus2);
            } else {
                System.out.println("Остальные коты не наелись");
            }
            if ((foodplus - arrayOfAnimals[0].getEatLimit() - arrayOfAnimals[1].getEatLimit()) > arrayOfAnimals[1].getEatLimit()) {
                int foodplus3 = foodplus - arrayOfAnimals[0].getEatLimit() - arrayOfAnimals[1].getEatLimit();
                arrayOfAnimals[2].eat(foodplus3);
            } else {
                System.out.println("Последний кот не наелся");
            }

        }


        if ((food - arrayOfAnimals[0].getEatLimit()) > arrayOfAnimals[0].getEatLimit()) {
            int food2 = food - arrayOfAnimals[0].getEatLimit();
            arrayOfAnimals[1].eat(food2);
        } else {
            System.out.println("Остальные коты не наелись");
        }
        if ((food - arrayOfAnimals[0].getEatLimit() - arrayOfAnimals[1].getEatLimit()) > arrayOfAnimals[1].getEatLimit()) {
            int food3 = food - arrayOfAnimals[0].getEatLimit() - arrayOfAnimals[1].getEatLimit();
            arrayOfAnimals[2].eat(food3);
        } else {
            System.out.println("Последний кот не наелся");
        }


    }
}
