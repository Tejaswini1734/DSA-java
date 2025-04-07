import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max1=-1;
            int max2=-1;
            Set<Integer> seen=new HashSet<>();
            for(int x:a){
                if(seen.contains(x)) continue;
                    seen.add(x);
                if(x>max1){
                    max2=max1;
                    max1=x;
                    
                }
                else if(x>max2){
                    max2=x;
                }
            }
            System.out.println(max1+max2);
        }
    }
}
