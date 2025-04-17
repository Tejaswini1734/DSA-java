class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // convert value to index
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // mark visited by making it negative
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1); // if not marked, then it's missing
            }
        }

        return ans;
    }
}
