package lesso5;

public class Main {


    public static void main(String[] args) {


        System.out.println("\nВывод первого сотрудника:\n");
        addPersons();

        System.out.println("\nВсего сотрудиников: " + Persons.getPersonsCount());

        System.out.println();

        System.out.println("Сотрудники старше 40 лет\n");
        personOver40();

    }

    private static void personOver40() {
        Persons[] persons = addPersonsForArray();

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40)
                persons[i].printInfo();
        }
    }

    private static Persons[] addPersonsForArray() {
        Persons[] persons = new Persons[5];
        persons[0] = new Persons("Петя", "Иванов", "Инженер", "mail.com", 123456789, 50000, 30);
        persons[1] = new Persons("Вася", "Смринов", "Инженер", "mail.com", 123456789, 60000, 30);
        persons[2] = new Persons("Коля", "Сидоров", "Инженер", "mail.com", 123456789, 70000, 25);
        persons[3] = new Persons("Поля", "Харитонов", "Инженер", "mail.com", 123456789, 80000, 80);
        persons[4] = new Persons("Моля", "Петров", "Инженер", "mail.com", 123456789, 90000, 38);
        return persons;
    }

    private static void addPersons() {
        Persons person1 = new Persons("Петя", "Иванов", "Инженер", "mail.com", 123456789, 50000, 30);
        Persons person2 = new Persons("Вася", "Смринов", "Инженер", "mail.com", 123456789, 60000, 30);
        Persons person3 = new Persons("Коля", "Сидоров", "Инженер", "mail.com", 123456789, 70000, 25);
        Persons person4 = new Persons("Поля", "Харитонов", "Инженер", "mail.com", 123456789, 80000, 80);
        Persons person5 = new Persons("Моля", "Петров", "Инженер", "mail.com", 123456789, 90000, 38);
        person1.printInfo();
    }
}
