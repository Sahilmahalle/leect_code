// write a program to find if the given array is palindrome or not

/*
input:[1,2,1]
output: true
*/


import java.util.Scanner;
class PalindromeArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		System.out.println("Enter Element In Array");
		// insert element in array
		for(int i=0 ; i<n ; i++){
			arr[i]=sc.nextInt();
		}	

		int first=0;
		int last=n-1;
		while(first!=last){
			if(arr[first]!=arr[last]){
				System.out.println("Not A Palindrome");
				return;
			}
			first++;
			last--;
		}
		System.out.println("It Is a Palindrome");
	}
}
