import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static int sod(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        
		    }
		    int digitsum=0;
		    int ans=0;
		    for(int i=0;i<n;i++){
		         for(int j=i+1;j<n;j++){
		             int prod=a[i]*a[j];
		             digitsum=sod(prod);
		             ans=Math.max(ans,digitsum);
		         }
		    }
		    System.out.println(ans);
		   
		}

	}
}
