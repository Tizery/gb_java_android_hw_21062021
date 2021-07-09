package hw5;

public class Person {    //Задание 1

    private String name;
    private String position;
    private String mail;
    private int phone;
    private int pay;
    private int age;

    public Person(String name, String position, String mail, int phone, int pay, int age) {  // Задание 2
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void info() {    // Задание 3
        System.out.printf("%s %s %s %d %d %d\n", name, position, mail, phone, pay, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                ", pay=" + pay +
                ", age=" + age +
                '}';
    }

    public int getAge() {  // Задание 5
        return age;
    }
}

