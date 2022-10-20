package lesson6;

import lesso5.Persons;

public class Main {
    public static void main(String[] args) {

        addAnimal();

        System.out.println("Всего котов: " + Cat.getCount());
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println();

        System.out.println("СПОРТ НАЧАЛСЯ!");
        System.out.println("Бег: ");
        System.out.println("--");
        initRun();

        System.out.println("Плавание: ");
        System.out.println("--");
        initSwim();

        System.out.println();


    }


    private static Animal[] addAnimal() {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cat", "Бисквит", 0, 200);
        animals[1] = new Cat("Cat", "Пушок", 0, 6);
        animals[2] = new Dog("Dog", "Гомер", 10, 500);
        animals[3] = new Dog("Dog", "Доги", 10, 500);
        return animals;

    }


    private static void initRun() {
        Animal[] animals = addAnimal();

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
        }
    }

    private static void initSwim() {
        Animal[] animals = addAnimal();
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(5);
        }
    }

}


