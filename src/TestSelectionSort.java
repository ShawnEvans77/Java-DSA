import java.util.Arrays;

public class TestSelectionSort {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -500, -900, -999 };

        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------------------");
        SelectionSort.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
