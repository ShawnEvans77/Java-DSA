import java.util.*;
public class TestQuickSort {
    public static void main(String[] args) {
        int[] A = {9, 8, 7, 6, -100, 20, 2, 5, -100, -999, 5000, -1, 2, 50, 33, 2, 1, -7, -9, -8, -2, 200, 2500, 41, 1, 2, 3};

        System.out.println(Arrays.toString(A));

        System.out.println("-----------------------------");

        QuickSort.quickSort(A);

        System.out.println(Arrays.toString(A));
    }
}