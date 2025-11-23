import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -500, -600, 900, 45};

        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------------------");
        BubbleSort.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
