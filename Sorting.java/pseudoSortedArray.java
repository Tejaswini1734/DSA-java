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
	      int cnt=0;
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      for(int i=0;i<n;i++){
	          a[i]=sc.nextInt();
	      }
	      for(int i=0;i<n-1;i++){
	          if(a[i]>a[i+1]){
	              int temp=a[i];
	              a[i]=a[i+1];
	              a[i+1]=temp;
	              break;
	          }
	      }
	      for(int i=0;i<n-1;i++){
	          if(a[i]>a[i+1]){
	              cnt++;
	              break;
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
