package Arrays;

import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {
    // Syntax of an arraylist
    // ArrayList<Datatype> name = new ArrayList<>();

    public void inputArrayListElements(ArrayList<Integer> list) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        in.close();
    }

    public void displayArrayList(ArrayList<Integer> list) {
        System.out.println(list);
    }

    public void getElementAtIndex(int index, ArrayList<Integer> list) {
        System.out.println(list.get(index));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        ArrayListExample obj = new ArrayListExample();

        obj.inputArrayListElements(arrayList);
        obj.displayArrayList(arrayList);

        // arrayList.add(100);
        // arrayList.add(140);
        // arrayList.add(160);
        // arrayList.add(110);
        // arrayList.add(130);
        // arrayList.add(120);
        // arrayList.add(20);

        // arrayList.set(0, 99);
        // System.out.println(arrayList);
        // System.out.println(arrayList.contains(100));
    }

}
