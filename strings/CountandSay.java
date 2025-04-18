import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
          Scanner sc=new Scanner(System.in);
          int t =Integer.parseInt(sc.nextLine());
          while(t-- >0){
              String num=sc.next();
              BigInteger nums=new BigInteger(num);
              BigInteger res=nums.add(BigInteger.ONE);
              System.out.println(res);
          }
	}
}
