package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cat[] pets = {
                new Cat("Пушок", 2),
                new Cat("Бисквит", 7),
                new Cat("Бартик", 5),
        };

        System.out.println("Укажите количество еды в миске:");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for (Cat i : pets) {
            while (!i.isFullness() && plate.getFood() >= i.getAppetite()) {
                i.eat(plate);
                plate.info();
            }

        }

        for (Cat i : pets) {
            if (i.isFullness()) {
                System.out.printf("Кот %s наелся\n", i.getCatName());
            } else {
                System.out.printf("Кот %s остался голодным, ему не хватило %d единиц еды\n", i.getCatName(), i.getCatFullness() - i.getCatSaturationFood());
            }
        }

        int addFood;
        plate.info();
        System.out.println("Сколько добавить еды в миску?");
        addFood = new Scanner(System.in).nextInt();
        plate.addFood(addFood);
        plate.info();

    }

}
