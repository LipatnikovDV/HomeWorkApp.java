package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("\nЗадание №2. Выводим 3 слова.");
        printThreeWords();

        System.out.println("Задание №3. Выводим сумму двух переменных.");
        checkSumSign();

        System.out.println("Задание №4. Выводим значение цвета.");
        printColor();

        System.out.println("Задание №5. Выводм сравнение чисел.");
        compareNumbers();

        System.out.println("Все задачи выполнены.");

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Три слова в столбец выведены.\n");

    }

    private static void checkSumSign() {
        int variable = ThreadLocalRandom.current().nextInt(-100, 100);
        System.out.println("Рандомное число: " + variable);
        if (variable >=0) {
            System.out.println("Сумма положительная.");
        } else System.out.println("Сумма отрицательная.");
        System.out.println("Переменные сложены.\n");

    }

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt();
        System.out.println("Рандомное число: " + value);
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <=100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }
        System.out.println("Цвет определён.\n");

    }

    private static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt();
        int b = ThreadLocalRandom.current().nextInt();
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
        System.out.println("Сравнение чисел выполнено.\n");

    }

}
