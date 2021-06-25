package hw1;

public class Main {

    public static void main(String[] args) {

        byte num1 = 1;       //Задание 2
        short num2 = 15;
        int num3 = 100;
        long num4 = 120046L;

        float num5 = 0.12345f;
        double num6 = 0.123456789;

        char num7 = 'A';
        boolean isTrue = false;

        System.out.println(calc(0.5f, 2.5f, 10, 3));   // Задание 3
        System.out.println(task(5, 9));     // Задание 4
        isPosOrNeg(230);     // Задание 5
        /* isPosOrNeg2(230);  На примере Задания 5 хотел бы задать вопрос:
                             я его выполнил двумя способами. Какой из них
                             правильнее или лучше?*/

        System.out.println(isNeg(-5));     // Задание 6
        printHello("Сергей");    // Задание 7
        isVis(2021);   // Задание 8*
    }

    public static float calc(float a, float b, float c, float d) {   // Задание 3
        return a * (b + (c / d));
    }

    public static boolean task(int a, int b) {    // Задание 4
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPosOrNeg(int a) {     // Задание 5
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

//    public static boolean isNum(int a){
//        return a >= 0;
//    }
//
//    public static void isPosOrNeg2(int a) {
//        if (isNum(a)) {
//            System.out.println("Число " + a + " положительное");
//        } else {
//            System.out.println("Число " + a + " отрицательное");
//        }
//    }

    public static boolean isNeg(int a) {     // Задание 6
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printHello(String name) {        //Задание 7
        System.out.println("Привет, " + name + " !");
    }

    public static void isVis(int a) {      // Задание 8*
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
