import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int ones = 0, twos = 0;
			
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				if (val == 1) ones++;
				else if (val == 2) twos++;
			}

			if (ones == 0 || twos == 0) {
				System.out.println(0);
			} else {
				// Can we make all 2s? Only if ones is even
				if (ones % 2 == 0) {
					System.out.println(Math.min(twos, ones / 2));
				} else {
					// We cannot make all even if ones is odd
					// So, best is to convert all 2s to 1s
					System.out.println(twos);
				}
			}
		}
	}
}
