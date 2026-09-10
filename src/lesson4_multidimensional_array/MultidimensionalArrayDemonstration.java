package lesson4_multidimensional_array;

public class MultidimensionalArrayDemonstration {

    static void main() {
        int[][] multiArray;
        multiArray = new int[][]{
                {1},
                {4, 5, 6, 5, 6},
                {7, 8, 9}
        };

        int[] elementOneArray = multiArray[0];
        System.out.println(elementOneArray[0]);
        // System.out.println(Arrays.toString(multiArray));

    }
}
