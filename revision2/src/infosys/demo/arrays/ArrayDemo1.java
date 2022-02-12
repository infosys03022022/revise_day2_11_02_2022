package infosys.demo.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
	//	datatype[] arrayVarName= {elements of array separated with ,}
// Array declaration and initialisation in a single line
	int array1[]= {1,2,3};
	int[] array2= {4,5,6};
    // here [] means the declaring is an array
	// The values in {} are the value in the different
	// location
	// here the position starts with 0
	// For array1
	// 1  2  3
	// 0  1	 2
	// For array2
	// 4 5 6
	// 0 1 2
	// The length of both the arrays are 3
	// How we are going to access the array
	// We can make use of loop specifically for loop
	// length is a predefined instance variable in array
	// In java arrays are also object and arrays are created during the runtime
	
	for(int i=0;i<array1.length;i++)
	{
		// i is a subscript or index of the array elements
		System.out.println(array1[i]);
	}
	 System.out.println("--------------");
	 // for each loop
	 for(int num : array1)
	 {
	  System.out.println(num);	 
	 }
	
	}

}
