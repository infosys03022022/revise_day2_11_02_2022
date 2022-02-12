package infosys.demo.classobject3;

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
		

	}

}
