import java.util.*;

public class MissingDollFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();  // Number of dolls
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int type = sc.nextInt();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.println(entry.getKey());  // Print the missing pair
                    break;
                }
            }
        }
    }
}
