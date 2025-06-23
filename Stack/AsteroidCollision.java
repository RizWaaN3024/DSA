import java.util.*;

public class AsteroidCollision {
    public static List<Integer> findAsteroidState(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                list.add(arr[i]);
            } else {
                while (!list.isEmpty() && list.get(list.size() - 1) > 0
                        && list.get(list.size() - 1) < Math.abs(arr[i])) {
                    list.remove(list.size() - 1);
                }
                if (!list.isEmpty() && list.get(list.size() - 1) == Math.abs(arr[i])) {
                    list.remove(list.size() - 1);
                } else if (list.isEmpty() || list.get(list.size() - 1) < 0) {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] asteroids = { 4, 7, 1, 1, 2, -3, -7, 17, 15, -16 };
        List<Integer> result = findAsteroidState(asteroids);
        System.out.println(result);
    }
}
