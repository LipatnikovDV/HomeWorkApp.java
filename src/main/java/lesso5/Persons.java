package lesso5;

public class Persons {

    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    private static int personsCount;

    public static int getPersonsCount() {
        return personsCount;
    }

    public Persons(String firstName, String lastName, String position, String email, int phoneNumber, int salary, int age) {

        setFirstName(firstName);
        setLastName(lastName);
        setPosition(position);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);

        personsCount++;


    }

        public Persons printInfo() {
            System.out.println(String.format("Сотрудник: %s %s.", firstName, lastName));
            System.out.println(String.format("Должность: %s.", position));
            System.out.println(String.format("Почта: %s.", email));
            System.out.println(String.format("Номер телефона: %s.", phoneNumber));
            System.out.println(String.format("Зарплата: %s рублей.", salary));
            System.out.println(String.format("Возраст: %s лет.", age));
            return null;
        }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public void setPosition(String position) {
        this.position = position.toUpperCase();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
