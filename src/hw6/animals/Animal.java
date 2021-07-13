package hw6.animals;

public class Animal {

    String name;
    int maxDistToRun;
    int maxDistToSwim;

    public Animal(String name, int maxDistToRun, int maxDistToSwim) {
        this.name = name;
        this.maxDistToRun = maxDistToRun;
        this.maxDistToSwim = maxDistToSwim;
           }

    public int run (int dist) {
        if (dist > maxDistToRun) {
            System.out.println(name + " не может пробежать больше " + maxDistToRun + " метров");
        } else {
            System.out.println(name + " пробежал " + dist + " метров");
        }
        return dist;
    }

    public int swim(int dist) {
        if( maxDistToSwim <= 0 || dist <= 0 ){
            System.out.println(name + " не умеет плавать :(");
        } else if ( dist > maxDistToSwim) {
            System.out.println(name + " не может проплыть больше " + maxDistToSwim + " метров");
        } else {
            System.out.println(name + " проплыл " + dist + " метров");
        }
        return dist;
    }
}