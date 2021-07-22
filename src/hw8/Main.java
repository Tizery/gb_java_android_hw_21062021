package hw8;

public class Main {

    public static void main(String[] args) {

//        Cat cat = new Cat("Барсик", 100, 1);
//        Human human = new Human("Иван", 500, 5);
//        Robot robot = new Robot("Rob-6", 1000, 10);
//        RunTrack runTrack = new RunTrack(2000);
//        Wall wall = new Wall(50);

//        cat.run(-50);
//        cat.jump(0);
//        human.run(600);
//        human.jump(60);
//        robot.run(600);
//        robot.jump(60);


        JumpRunnable[] members = {
                new Cat("Барсик", 100, 2),
                new Human("Иван", 500, 5),
                new Robot("Rob-6", 1000, 10)
        };

        Obstacle[] obs = {
                new RunTrack(150),
                new Wall(8)
        };

        for (JumpRunnable jr : members) {
            for (Obstacle o : obs) {
                if (!o.action(jr)) {
                    break;
                }
            }
        }

    }
}



