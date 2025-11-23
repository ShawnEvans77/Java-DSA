import java.util.Arrays;
public class BubbleSort {
    /**
     * Given [100,1,2,3,4,5,6,7,8,9]
     * At the end of i = 0
     * 100 "bubbles" to the end of the list
     * 100 swaps with each number until it reaches the end, this is i = 0.
     * [1,2,3,4,5,6,7,8,9,100]
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------------------");
        bubbleSort(nums);
    }

}