package tms;

public class ArraysChecker {
    static void main() {
        int[] array = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13, -1};

        int min = 0;
        int max = 0;
        for(int element : array) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
