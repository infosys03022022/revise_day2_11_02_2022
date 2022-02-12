package infosys.demo.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int numArray[]= {11,20,35,42,5};
		 // LHS a int variable to hold the data one by one which are passesd from the array
		// which is on the RHS
		for(int n : numArray)
		{
			System.out.println(n);
		}
		int num=numArray[0];
		// num is holding 11
        numArray[0]=numArray[1];
        // numArray[0] is having 20
        numArray[1]=num;
        // numArray[1] is having 11
        for(int n : numArray)
		{
			System.out.println(n);
		}
	}

}
