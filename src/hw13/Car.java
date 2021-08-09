package hw13;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static AtomicInteger winner = new AtomicInteger(0);
    //   static {
//        winner = new AtomicInteger(0);
//    }
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cb;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
    }

    @Override
    public void run() {

        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cb.await();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            long endTime = System.currentTimeMillis();
            if (winner.incrementAndGet() == 1) {
                System.out.println(name + " WINNER !!!    " + "Закончил гонку за " + (endTime - startTime) + " мс");
            }
            cb.await();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}