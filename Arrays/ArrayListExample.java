package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    // Syntax of an arraylist
    // ArrayList<Datatype> name = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(100);
        arrayList.add(140);
        arrayList.add(160);
        arrayList.add(110);
        arrayList.add(130);
        arrayList.add(120);
        arrayList.add(20);

        System.out.println(arrayList);
        System.out.println(arrayList.contains(100));
    }

}
 