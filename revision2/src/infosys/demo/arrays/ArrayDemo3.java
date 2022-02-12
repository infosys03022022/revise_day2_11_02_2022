package infosys.demo.arrays;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		int num[]=new int[5];
     // 1) int num[]; We are declaring an array as we have []
     // 2) num=new int[5]; // Arrays are created during the runtime just like 
		// any other objects in Java. int[5] with a size of 5
		// int num[5];
		// the subscript should be from 0 to 4  ==> 0,1,2,3,4
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter the number");
			num[i]=scan.nextInt();
		}
		// for each is never used to store the data
		// it is used for reading the data
		for(int n : num)
		{
			System.out.println(n);
		}
		
	}

}
