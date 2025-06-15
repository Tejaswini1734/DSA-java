import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    while(T --> 0){
		    int N = sc.nextInt();
		    String S = sc.next();
		    int count = 0;
		    for (int i=0;i<N-1;i++){
		        if(S.substring(i, i+2).equals("10")){
		            count++;
		            i++;
		        }
		    } 
		    System.out.println(count);
		}

	}
}
