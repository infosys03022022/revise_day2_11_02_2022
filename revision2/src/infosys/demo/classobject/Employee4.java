   package infosys.demo.classobject;
 // All the members id, name and basic and the method displayEmployee
   // are having default access specifier
   // When we dont mention any access specifier, it is default
   // default members are accessible within the class
   public class Employee4 {
       int id;      // id, name and basic are instance variables/attributes
       String name;
       int basic;
       
       Employee4(int i, String nm, int b)
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
        void displayEmployee() {
    	   System.out.println(id);  // member of class is being accessed by objectname.instance variable name
           System.out.println(name);
           System.out.println(basic);
      }
       
       public static void main(String args[]) {
        Employee4 emp=new Employee4(1,"Ashok",3000);  
        //We cannot call displayEmployee from main directly ( without object )
        // because displayEmployee() is a non static member
        //displayEmployee();
        // So in that case we call displayEmployee wit the object and able to access
        emp.displayEmployee();
        Employee4 emp2=new Employee4(2,"Nandini",4000);
        emp2.displayEmployee();

      }
    }