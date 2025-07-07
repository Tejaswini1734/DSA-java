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
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    for(int j=0;j<a;j++){
		        int k=sc.nextInt(),n=sc.nextInt(),q=sc.nextInt();
		        if(k!=q && n%2!=0){
		            System.out.println((n/2)+1);
		        }
		        else{
		            System.out.println(n/2);
		        }
		    }
		}

	}
}
