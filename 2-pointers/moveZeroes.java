public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;  // Pointer to track position for non-zero elements
        
        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                if (nonZeroIndex != i) {
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        printArray(nums);  // Output: 1 3 12 0 0
    }
}
