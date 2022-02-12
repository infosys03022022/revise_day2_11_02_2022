   package infosys.demo.classobject;
 
  
   
   public class EmployeeMain3 {
        
      public static void main(String args[]) {
        Employee8 emp=new Employee8(1,"Ashok",3000);  
        emp.displayEmployee();
        // private members are not accessible from other class
        //System.out.println(emp.id);
        //System.out.println(emp.name);
        Employee8 emp2=new Employee8(2,"Nandini",4000);
        emp2.displayEmployee();

      }
    }