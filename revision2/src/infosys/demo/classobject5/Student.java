package infosys.demo.classobject5;

public class Student {
  private int roll;
  private String name;
  private int marks;
    
public Student(int roll, String name, int marks) {
	
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
// Do you think this keyword is required
 /* public Student() {
	roll=1;
	name="Tom";
	marks=100;
} */
// constructor chaining ==> calling constructor from 
// a constructor
public Student() {
	this(1,"Tom",100);
}
 
 
 

public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
  
  
}
