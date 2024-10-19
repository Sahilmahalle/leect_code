// write a program to reverse a string without using a built in functions

import java.util.*;

class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			result+=s.charAt(i);
		}
		System.out.println(result);
	
	}
}
