import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-- >0){
             String s=sc.next();
             int sum=0;
             for(int i=0;i<s.length();i++){
                 if(Character.isDigit(s.charAt(i))){
                    int temp=s.charAt(i);
                    sum+=temp-48;
                 }
             }
             System.out.println(sum);
         }
	}
}
