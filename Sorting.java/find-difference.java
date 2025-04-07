import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        
        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s.toCharArray()) {
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }
        
        return (char) count.keySet().toArray()[0];        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter string t (s with one extra char): ");
        String t = scanner.nextLine();

        Solution solution = new Solution();
        char result = solution.findTheDifference(s, t);
        System.out.println("The extra character is: " + result);

        scanner.close();
    }
}
