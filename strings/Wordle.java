import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-- >0){
		    String s=sc.nextLine();
		    String a=sc.nextLine();
		    StringBuilder m=new StringBuilder();
		    for(int i=0;i<5;i++){
		        if(s.charAt(i)==a.charAt(i)){
		            m.append("G");
		        }
		        else{
		            m.append("B");
		        }
		    }
		    System.out.println(m);
		    
		}

	}
}
