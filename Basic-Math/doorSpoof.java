import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0){
          int n=sc.nextInt();
          int a[]=new int[n];
          int cnt=0;
          for(int i=0;i<n;i++){
              a[i]=sc.nextInt();
               if(a[i] %2 == 0){
                  cnt++;
              }
              
          }
          if(cnt==0){
              
          System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }
          
      }
	}
}
