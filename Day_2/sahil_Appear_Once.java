/*
write a program to printl element that appear only once
*/

import java.util.*;

class AppearOnce
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of Array");
		int n=sc.nextInt();

		int arr[]=new int [n];
		System.out.println("Enter Element in Array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
		Arrays.sort(arr);
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<n;i++){
			if(s.isEmpty()){
				s.push(arr[i]);
			}else if(s.peek()==arr[i]){

				s.pop();
			}else{

				s.push(arr[i]);
			}
				
			
		}
		System.out.println(s);
	}
}
