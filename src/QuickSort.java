public class QuickSort {

    public static void quickSort(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        quickSort(nums, start, end);
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int q = partition(nums, start, end);
            quickSort(nums, start, q - 1);
            quickSort(nums, q + 1, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[end];
        nums[end] = temp;

        return i + 1;
    }

}
