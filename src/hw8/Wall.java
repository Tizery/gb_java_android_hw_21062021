package hw8;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean action(JumpRunnable jr) {
        return jr.jump(height);
    }
}

