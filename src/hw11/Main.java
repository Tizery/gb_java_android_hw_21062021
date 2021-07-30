package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // Задание 1
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        String[] arr = {"123", "yosip", "3", "hello", "zxc", "qwe"};
//        Character[] arr = {'A', 'c', 'T', 'W', '@', '#'};
        System.out.println(Arrays.toString(arr));

        try {
            swap(arr, 1, 5);
            System.out.println(Arrays.toString(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("");

        // Задание 2
        convert(arr);
        System.out.println("");

        // Задание 3
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<>(new Orange(), new Orange());
//        System.out.println(appleBox.getBox());

        System.out.println(appleBox + " :Вес коробки: " + appleBox.getBoxWeight());
        System.out.println(appleBox2 + " :Вес коробки: " + appleBox2.getBoxWeight());
        System.out.println(orangeBox + " :Вес коробки: " + orangeBox.getBoxWeight());
        System.out.println(orangeBox2 + " :Вес коробки: " + orangeBox2.getBoxWeight());

        appleBox.addFruit(new Apple()); // метод, добавляющий фрукт
        System.out.println(appleBox + " :Вес коробки: " + appleBox.getBoxWeight());

        System.out.println(appleBox.compare(orangeBox2)); // метод сравнения коробок

        orangeBox.replace(orangeBox); // метод, пересыпающий фрукты
        System.out.println(orangeBox + " :Вес коробки: " + orangeBox.getBoxWeight());
        System.out.println(orangeBox2 + " :Вес коробки: " + orangeBox2.getBoxWeight());

    }

    /**
     * Метод меняет местами 2 заданных элемента массива
     *
     * @param arr массив любого ссылочного типа
     **/
    private static <T> void swap(T[] arr, int index1, int index2) {
        T x = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = x;
    }

    /**
     * Метод преобразовывает массив в ArrayList
     *
     * @param arr массив любого ссылочного типа
     **/
    private static <T> void convert(T[] arr) {
        List<T> list = new ArrayList<T>(Arrays.asList(arr));
        System.out.println(list); // для проверки
    }

}