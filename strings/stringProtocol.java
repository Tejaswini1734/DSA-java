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
             String s=sc.next();
             int cnt=0;
             for(int i=0;i<n;i++){
                 if(i<s.length() -1 && s.charAt(i)==s.charAt(i+1)){
                     i++;
                 }
                 cnt++;
                 
             }
             System.out.println(cnt);
         }
	}
}
