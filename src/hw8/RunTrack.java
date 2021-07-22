package hw8;

public class RunTrack implements Obstacle {

    private int lenght;

    public RunTrack(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean action(JumpRunnable jr) {
        return jr.run(lenght);
    }
}
