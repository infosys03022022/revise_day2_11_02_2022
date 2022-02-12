package infosys.demo.classobject;

public class Employee10Main {

	public static void main(String[] args) {
		// In the following program we created 2 objects , one in line 7 and another in line 10
		Employee10 emp=new Employee10();
		emp.displayData();
		emp.setData();
		emp.displayData();
		emp.setData();
		emp.displayData();
		Employee10 emp2=new Employee10();
		emp2.setData();
		emp2.displayData();
		/*
		 * Employee10 emp=new Employee10();
		 * emp=new Employee10();
		 * 
		 * The line 14 and 15 means in line 14 we created an object and stored the reference
		 * in emp. In line 15 we created one more object and stored the reference in emp.
		 * So the object created in line 14 lost its reference as it is overwritten by the address
		 * of the object created in line 15.
		 */

	}

}
