package hw7;

public class Cat {

    private String name;
    private int appetite;
    private boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (appetite <= 0) {
            System.out.println("Ошибка! Нельзя ввести отрицательное или нулевое значение!");
            return;
        }
        if (appetite > plate.getFood()) {
            System.out.printf("В тарелке не достаточно еды, чтобы кот %s покушал\n", name);
        } else {
            System.out.printf("Кот %s скушал %d единиц еды\n", name, appetite);
            plate.decrease(appetite);
            isSatiety = true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isSatiety=" + isSatiety +
                '}';
    }

    public void satietyInfo() {
        System.out.printf("Сытость кота %s = %b\n", name, isSatiety);
    }
}
