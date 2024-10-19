// write a program to rotate an array

import java.util.*;

class RotateArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int  last= arr[n-1];
		for(int i=n-2;i>=0;i--){
			arr[i+1]=arr[i];
		}
		arr[0]=last;
		System.out.println(Arrays.toString(arr));
	}
}
