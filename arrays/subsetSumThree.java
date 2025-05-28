import java.util.*;

public class SubsetSumDiv3NoDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            boolean hasMod0 = false;
            boolean hasMod1 = false;
            boolean hasMod2 = false;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                int mod = A[i] % 3;
                if (mod == 0) hasMod0 = true;
                if (mod == 1) hasMod1 = true;
                if (mod == 2) hasMod2 = true;
            }

            if (hasMod0 || (hasMod1 && hasMod2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
