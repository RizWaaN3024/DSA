package BinarySearch;

import java.util.*;

public class KokoEatingBananas {

    public static int findMinEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    public static boolean canEatInTime(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piles[] = { 3, 6, 7, 11 };
        int h = 8;
        int minSpeed = findMinEatingSpeed(piles, h);
        System.out.println(minSpeed);
    }
}
