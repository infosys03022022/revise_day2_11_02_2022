package infosys.demo.classobject;
  public class Student2 {
     private int roll;
     private String name;
     private int marks;
// parameter name and the member variable names are
    // same
     // so in that case parameter as it is a local
     // variable , its preference will be more in
     // comparison to the instance variable
     // the line 16 , means in the local variable roll we are assigning again the same value
     // what will be the value within the instance variable?
     // ans: it will have the default value because of the
     // default constructor
     void setRoll(int roll) {
     roll=roll;
     }
     int getRoll(){
     return roll;
     }
     void setName(String name){
     name=name; 
     }
     String getName(){
     return name;
     }
     void setMarks(int marks){
     marks=marks;
     }
     int getMarks() {
      return marks;
     }
    }