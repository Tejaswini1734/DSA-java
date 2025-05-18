import java.util.*;

public class Solution {
    public int minSwapsToSortByDigitSum(int[] nums) {
        int n = nums.length;

        // Create original index-value pairs
        List<Pair> original = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            original.add(new Pair(nums[i], i));
        }

        // Sort based on digit sum, then value
        List<Pair> sorted = new ArrayList<>(original);
        sorted.sort((a, b) -> {
            int sumA = digitSum(a.value);
            int sumB = digitSum(b.value);
            if (sumA != sumB) return sumA - sumB;
            return a.value - b.value;
        });

        // Mapping from sorted index to original index
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || sorted.get(i).index == i) continue;

            int cycle_size = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = sorted.get(j).index;
                cycle_size++;
            }

            if (cycle_size > 1) swaps += (cycle_size - 1);
        }

        return swaps;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private class Pair {
        int value, index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
