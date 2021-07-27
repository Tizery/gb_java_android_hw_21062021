package hw10;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Задание 2
public class PhoneBook {

    private Map<String, Set<String>> phoneBookMap = new TreeMap<>();

    public void add(String name, String phoneNumber) {
        Set<String> number = phoneBookMap.getOrDefault(name, new HashSet<>());
        number.add(phoneNumber);
        phoneBookMap.put(name, number);
    }

    public Map<String, Set<String>> getPhoneBookMap() {
        return phoneBookMap;
    }

    public Set<String> get(String name) {
        return phoneBookMap.get(name);
    }
}
