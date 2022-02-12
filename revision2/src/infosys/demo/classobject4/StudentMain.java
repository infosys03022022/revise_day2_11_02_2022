package infosys.demo.classobject4;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student(1,"Tom",70);
		// After creating the object displaying data
		System.out.println("-----After object creation----");
		System.out.println(student.getRoll());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		// After setting the details in the
		// object , displaying data
		// The below setRoll , setName ,setMarks
		// can be provided with the data after
		// entering the data from user
		// through scanner object of Scanner class
		student.setRoll(111);
		student.setName("John");
		student.setMarks(90);
		System.out.println("------ After setting the details-------");
		System.out.println(student.getRoll());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		// For parameterless constructor the code
		// is showing error
		// Reason is , Student class is not having
		// parameterless constructor
		// the parameterless constructor ( default )
		// is provided to the code if you are not
		// writing any constructor declaration in the'
		// code but in our example , the class is 
		// having the user defined parameterized 
		// constructor
		
		// So to avoid getting error for the
		// parameterless constructor
		// define explicitly a parameterless constructor
		//Student student2=new Student();
		

	}

}
