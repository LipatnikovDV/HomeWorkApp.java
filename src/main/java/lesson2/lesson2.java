package lesson2;

public class lesson2 {
    public static void main(String[] args) {
//          Задание №1
        System.out.println();
        System.out.println("Проверка суммы в пределах от 10 до 20.");
        System.out.println();
        boolean isSumm = summBetween(0,0);
        System.out.println(isSumm);
        System.out.println();
        System.out.println(summBetween(0, 19));
        System.out.println("Проверка окончена");
        System.out.println();
//          Задание №2
        System.out.println("Проверка положительности числа");
        int isPositiveOrNegative = number(-4);
        System.out.println("Проверка числа окончена");
        System.out.println();
//       Задание №3
        System.out.println("Проверка положительности числа");
        boolean isPositive = number2(7);
        System.out.println(isPositive);
        System.out.println("Проверка числа окончена");
        System.out.println();
//         Задание №4
        System.out.println("Отпечатать указанную строку, указанное количество раз");
        cycleStringNumber("Текст", 2);
        System.out.println("Задание сделано");
        System.out.println();
//        Задание №5
        System.out.println("Найти высокосный год не успел");

    }
    private static boolean summBetween(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("Сумма чисел = " + (a + b) + " и лежит в пределах от 10 до 20");
            return true;
        } else System.out.println("Сумма чисел = " + (a + b) + " и не лежит в пределах от 10 до 20");
        return false;

    }
    private static int number(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " отрицательное");
        return a;

    }
    private static boolean number2(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительно");
            return true;
        } else System.out.println("Число " + a + " отрицательное");
        return false;

    }
    private static void cycleStringNumber(String a, int b) {
        System.out.println("Написать слово " + a + " " + b + " раз");
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

}