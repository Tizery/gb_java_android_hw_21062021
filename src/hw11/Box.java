package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{

    List<T> box = new ArrayList();

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

//    public List<T> getBox() {
//        return box;
//    }

    public float getBoxWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            totalWeight = totalWeight + box.get(i).getWeight();
        }
        return totalWeight;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public boolean compare (Box<? extends Fruit> anotherBox) {
        return Math.abs(getBoxWeight() - anotherBox.getBoxWeight()) < 0.000001f;
    }

    public void replace (Box<T> anotherBox) {
        if (anotherBox == this) {
            System.out.println("Ошибка!");
            return;
        }
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                '}';
    }
}
