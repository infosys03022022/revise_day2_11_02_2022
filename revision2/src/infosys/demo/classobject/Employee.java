   package infosys.demo.classobject;
 // For non static we have to create the object and then access
   // so here we are creating the object of Employee and then
   // accessing its member
   // In this code we have not initialised the variable
   // id , name and basic with a value
   // but there is no compilation error like
   // local variables which need to be initialised 
   // before access
   // Reason is in case of instance variables , they are initialised with 
   // default constructor. Default constructor is provided during the compilation.
   // Constructors are used to initialise object
   public class Employee {
       int id;      // id, name and basic are instance variables
       String name;
       int basic;
       public static void main(String args[]) {
        Employee emp=new Employee();  // In this line object creation is taking place
        System.out.println(emp.id);  // member of class is being accessed by objectname.instance variable name
        System.out.println(emp.name);
        System.out.println(emp.basic);

      }
    }