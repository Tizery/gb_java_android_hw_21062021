package hw6;

import hw6.animals.*;

public class Main {

    public static void main(String[] args) {

        Animal catBarsik = new Cat("Барсик", 200, 0);
        Animal dogBobik = new Dog("Бобик", 500, 10);
        Animal catOleg = new Cat("Олег", 300, 10);
        Animal catMyrzik = new Cat ("Мурзик" , 50, 3);

        catBarsik.run(150);
        dogBobik.run(501);
        catOleg.run(250);
        catMyrzik.run(49);

        catBarsik.swim(1);
        dogBobik.swim(8);
        catOleg.swim(6);
        catMyrzik.swim(4);
    }
}

