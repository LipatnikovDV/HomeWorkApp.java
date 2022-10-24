package lesson7;

public class Cat {
    private String catName;
    private int appetite;
    private int countOfFulness = 2;
    private int catSaturationFood;
    private int catFullness;
    private boolean fullness;

    public Cat(String catName, int appetite) {
        this.catName = catName;
        this.appetite = appetite;
        this.catSaturationFood = 0;
        this.fullness = false;
        this.catFullness = this.appetite * countOfFulness;
    }

    public int getCatSaturationFood() {
        return catSaturationFood;
    }

    public int getCatFullness() {
        return catFullness;
    }

    public String getCatName() {
        return catName;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void eat(Plate plate) {
        if (this.fullness) {
            return;
        }
        if (plate.decreaseFood(this.appetite)) {
            System.out.printf("Кот %s съел %d единиц еды\n", this.catName, this.appetite);
            this.catSaturationFood += this.appetite;
            if (this.catSaturationFood == this.catFullness) {
                this.fullness = true;
            }
        }
    }
}
