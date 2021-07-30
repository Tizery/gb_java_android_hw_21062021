package hw10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        String[] arrWords = {"привет", "как", "твои", "дела", "чем", "ты", "дела", "как",
                "занимаешься", "занимаешься", "ты", "как", "ты", "ты"};
        System.out.println(Arrays.toString(arrWords) + " : " + arrWords.length + " элементов");

        Map<String, Integer> map = new HashMap<>();
        for (String x : arrWords) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // Задание 2
        PhoneBook pb = new PhoneBook();
        pb.add("Вахитов", "789456");
        pb.add("Вахитов", "123456");
        pb.add("Петров", "777888");
        pb.add("Иванов", "121212");
        pb.add("Сидоров", "323232");
        pb.add("Петров", "454545");
        pb.add("Вахитов", "222222");

        System.out.println(pb.getPhoneBookMap());
        System.out.println("Тел:" + pb.get("Вахитов"));
        System.out.println("Тел:" + pb.get("Сидоров"));



    }

}
