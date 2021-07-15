package hw7;

public class Main {

    public static void main(String[] args) {

//        Cat catBarsik = new Cat("Барсик", -50);
//        Cat catMyrzik = new Cat("Мурзик", 50);
//        Cat catBobik = new Cat("Бобик", 100);

        Plate plate = new Plate(100);

        Cat[] cats = {
                new Cat("Барсик", 7),
                new Cat("Мурзик", 93),
                new Cat("Бобик", 60),
                new Cat("Шарик", -10),
        };

//        System.out.println(plate);
//        catBarsik.eat(plate);
//        catBarsik.satietyInfo();
//        System.out.println(plate);
//        catMyrzik.eat(plate);
//        catMyrzik.satietyInfo();
//        System.out.println(plate);
//        catBobik.eat(plate);
//        catBobik.satietyInfo();
//        System.out.println(plate);

        System.out.println(plate);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].satietyInfo();
            System.out.println(plate);
            System.out.println("");
            }

        plate.increase(200);
        System.out.println(plate);
    }
}
