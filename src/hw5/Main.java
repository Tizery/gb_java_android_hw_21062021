package hw5;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Петров Пётр Петрович", "Директор", "post@mail.ru",
                8901, 1000, 55);
        Person person2 = new Person("Иванов Иван Иванович", "Менеджер", "post2@mail.ru",
                8902, 600, 35);
        Person person3 = new Person("Осадчая Алиса Викторовна", "Бухгалтер", "post3@mail.ru",
                8903, 800, 47);
        Person person4 = new Person("Ламекина Елена Ивановна", "Офис-менеджер", "post4@mail.ru",
                8904, 450, 33);
        Person person5 = new Person("Филатов Сергей Максимович", "Маркетолог", "post5@mail.ru",
                8905, 650, 42);

        person.info();   // Задание 3
//        System.out.println(person3);

//        Person[] persons = new Person[5];    // Задание 4
//        persons[0] = new Person("Петров Пётр Петрович", "Директор", "post@mail.ru",
//                8901, 1000, 55);
//        persons[1] = new Person("Иванов Иван Иванович", "Менеджер", "post2@mail.ru",
//                8902, 600, 35);
//        persons[2] = new Person("Осадчая Алиса Викторовна", "Бухгалтер", "post3@mail.ru",
//                8903, 800, 47);
//        persons[3] = new Person("Ламекина Елена Ивановна", "Офис-менеджер", "post4@mail.ru",
//                8904, 450, 33);
//        persons[4] = new Person("Филатов Сергей Максимович", "Маркетолог", "post5@mail.ru",
//                8905, 650, 42);

        Person[] persons = {       // Задание 4
                new Person("Петров Пётр Петрович", "Директор", "post@mail.ru",
                8901, 1000, 55),
                new Person("Иванов Иван Иванович", "Менеджер", "post2@mail.ru",
                8902, 600, 35),
                new Person("Осадчая Алиса Викторовна", "Бухгалтер", "post3@mail.ru",
                8903, 800, 47),
                new Person("Ламекина Елена Ивановна", "Офис-менеджер", "post4@mail.ru",
                8904, 450, 33),
                new Person("Филатов Сергей Максимович", "Маркетолог", "post5@mail.ru",
                8905, 650, 42)
        };

//        for (int i = 0; i < persons.length; i++) {
//            System.out.println(persons[i]);
//        }
//        System.out.println();

        for (int i = 0; i < persons.length; i++) {   // Задание 5
            if (persons[i].getAge() > 40) {
                System.out.println(persons[i]);
            }
        }
    }
}