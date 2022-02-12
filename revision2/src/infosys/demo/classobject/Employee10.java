package infosys.demo.classobject;

import java.util.Scanner;

public class Employee10 {
private int id;
private String name;
private int marks;
// We have the parameterless and parameterized constructors

 Employee10()
 {
	 id=1;
	 name="Xyz";
	 marks=100;
 }
 
 Employee10(int i, String n, int m)
 {
	 id=i;
	 name=n;
	 marks=m;
 }
// member methods 
 void setData() {
	 // FQN of a class ( Fully qualified name of class ===> class along with its package name)
	  //java.util.Scanner scan=new java.util.Scanner(System.in);
	  // To avoid mention the package name along with the class name, we use the import statement	
	   Scanner scan=new Scanner(System.in);
	   // Scanner is a predefined class and scan is a reference variable
	   System.out.println("Enter the id");
	   id=scan.nextInt();
	   System.out.println("Enter the name");
	   name=scan.next();
	   System.out.println("Enter the marks");
	   marks=scan.nextInt();
	  
	   
 }
 
 void displayData() {
	 System.out.println("ID "+id);
	 System.out.println("NAME "+name);
	 System.out.println("MARKS "+marks);
	 
 }
 
}
