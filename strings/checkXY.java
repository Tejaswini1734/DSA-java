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
		    String a=sc.next();
		    int c=0;
		    
		    for(int i=0;i<a.length();i++){
		        if(i>0){
		            if((a.charAt(i)=='x'&&a.charAt(i-1)=='y')||(a.charAt(i)=='y'&&a.charAt(i-1)=='x')){
		                c++;
		                i++;
		            }
		        }
		    }
		        System.out.println(c);
		    
		}

	}
}
