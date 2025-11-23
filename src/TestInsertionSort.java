import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -400, -900, 999 };

        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------------------");
        InsertionSort.insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
