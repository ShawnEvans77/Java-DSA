public class BinarySearch {

    /**
     * Looking for a number in a sorted list of items!
     * Jump to the middle. 
     * If the middle is bigger than your number, move left.
     * If the middle is smaller than your number, move right. 
     * @param nums The input array.
     * @param target The number you are looking for.
     * @return The index of the specified number, or {@code -1} if the number does not exist in the list.
     */
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == nums[mid])
                return mid;
            else if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
        }

        return -1;
    }

}
