import java.util.*;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        fillMap(map, nums1, 1);
        fillMap(map, nums2, 2);
        fillMap(map, nums3, 3);

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    private void fillMap(Map<Integer, Set<Integer>> map, int[] nums, int index) {
        for (int num : new HashSet<>(Arrays.stream(nums).boxed().toList())) {
            map.putIfAbsent(num, new HashSet<>());
            map.get(num).add(index);
        }
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
        System.out.println(sol.twoOutOfThree(nums1, nums2, nums3)); // Output: [2, 3]
    }
}
