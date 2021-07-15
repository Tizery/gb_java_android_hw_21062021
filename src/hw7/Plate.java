package hw7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public boolean decrease(int appetite) {
        if (food <= 0) {
            return false;
        }
        food -= appetite;
        return true;
    }

    public boolean increase(int addFood) {
        if (addFood <= 0) {
            System.out.println("Ошибка! Нельзя ввести отрицательное или нулевое значение!");
            return false;
        }
        food += addFood;
        System.out.printf("В тарелку добавили %d единиц еды\n", addFood);
        return true;
    }
}
