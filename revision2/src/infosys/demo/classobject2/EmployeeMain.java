package infosys.demo.classobject2;

public class EmployeeMain {

	// Now the data displayed is fine!!!!
	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setId(1);
	emp.setName("Tom");
	emp.setBasic(23000);
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getBasic());
	}

}
