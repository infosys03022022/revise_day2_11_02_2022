package infosys.demo.classobject;

public class Demo2 {

	
	public static void add(int num1, int num2)
	{
		// In this code result is having local scope to the add method.
		// The parameters num1 and num2 are having local scope to the add method
		int result=0;
		result=num1+num2;
	    System.out.println(result);
	}
	
	public static void main(String[] args) {
		// num1 and num2 are local to main method
		int num1=10;
		int num2=20;
		add(num1,num2);
		

	}

}
