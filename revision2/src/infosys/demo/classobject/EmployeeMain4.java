   package infosys.demo.classobject;
 
  
   
   public class EmployeeMain4 {
        
      public static void main(String args[]) {
        Employee9 emp=new Employee9(1,"Ashok",3000);  
        emp.displayEmployee();
        // private members are not accessible from other class
        //System.out.println(emp.id);
        //System.out.println(emp.name);
        Employee9 emp2=new Employee9(2,"Nandini",4000);
        emp2.displayEmployee();

      }
    }