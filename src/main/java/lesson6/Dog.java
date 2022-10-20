package lesson6;

public class Dog extends Animal {

    private static int count;

    public Dog(String type, String name, int swim, int run) {
        this.type = type;
        this.name = name;
        this.swim = swim;
        this.run = run;


        count++;
    }

    public static int getCount() {

        return count;
    }

}
