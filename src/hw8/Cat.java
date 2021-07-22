package hw8;

public class Cat implements JumpRunnable {

    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= 0) {
            System.out.println("Введено не еврное значение!");
            return false;
        }
        if (dist <= maxRun) {
            System.out.printf("%s успешно пробежал %d метров\n", name, dist);
            return true;
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, dist);
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= 0) {
            System.out.println("Введено не еврное значение!");
            return false;
        }
        if (dist <= maxJump) {
            System.out.printf("%s успешно прыгнул на %d метров\n", name, dist);
            return true;
        } else {
            System.out.printf("%s не смог прыгнуть на %d метров\n", name, dist);
            return false;
        }
    }
}
