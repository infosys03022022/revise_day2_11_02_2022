   package infosys.demo.classobject;
 // All the members id, name and basic and the method displayEmployee
   // are having default access specifier
   // When we dont mention any access specifier, it is default
   // default members are accessible within the class
   public class Employee5 {
       private int id;      // id, name and basic are instance variables/attributes
       private String name;
       private int basic;
       
       private Employee5(int i, String nm, int b)
       {
    	   id=i;
    	   name=nm;
    	   basic=b;
       }
       // non static member can access non static member
       // without object and that is the reason
       // we are not creating the object of Employee4
       // in displayEmployee and we are directly accessing
       // members from displayEmployee()
       // displayEmployee is a non static method
        private void displayEmployee() {
    	   System.out.println(id);  // member of class is being accessed by objectname.instance variable name
           System.out.println(name);
           System.out.println(basic);
      }
       
      public static void main(String args[]) {
        Employee5 emp=new Employee5(1,"Ashok",3000);  
        //We cannot call displayEmployee from main directly ( without object )
        // because displayEmployee() is a non static member
        //displayEmployee();
        // So in that case we call displayEmployee wit the object and able to access
        emp.displayEmployee();
        // So even we are able to access the member variables from main method
        System.out.println(emp.id);
        System.out.println(emp.name);
        Employee5 emp2=new Employee5(2,"Nandini",4000);
        emp2.displayEmployee();

      }
    }