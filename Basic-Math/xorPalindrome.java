/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner hu = new Scanner(System.in);
        int t = hu.nextInt();
        for(int i = 0;i<t;i++){
            int n = hu.nextInt();
            String a = hu.next();
            int to = 0;
            for(int j = 0;j<n/2;j++){
                if(a.charAt(j) != a.charAt(n-1-j)){
                    to = to + 1;
                }
            }
            System.out.println((to+1)/2);
        }
	}
}
