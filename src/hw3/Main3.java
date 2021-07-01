package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main3 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число");
        int resolution = 1;
        game();
        for (int i = resolution; i >= 1; i++) {
            System.out.println("Повторить игру еще раз? Введите 1 если да или 0 если нет");
            i = sc.nextInt();
            if (i == 0) {
                System.out.println("До свидания!");
                break;
            } else {
                game();
            }
        }
    }

    public static void game() {
        int thinkNumber = random.nextInt(10);
//            System.out.println(thinkNumber);
        System.out.println("Попробуйте угадать загаданное число в пределах от 0 до 9. У Вас есть 3 попытки.");
        for (int i = 1; i < 4; i++) {
            System.out.println("Попытка № " + i);
            int input = sc.nextInt();
            if (thinkNumber == input) {
                System.out.println("Вы угадали!");
                break;
            } else if (input > thinkNumber) {
                System.out.println("Введенное  Вами число больше загаданного");
            } else {
                System.out.println("Введенное  Вами число меньше загаданного");
            }
            System.out.println("К сожалению Вы не угадали");
        }
    }
}














