   package infosys.demo.classobject;
 
   class Employee7 {
       private int id;      // id, name and basic are instance variables/attributes
       private String name;
       private int basic;
       
       Employee7(int i, String nm, int b)
       {
    	   id=i;
    	   name=nm;
    	   basic=b;
       }
      
       void displayEmployee() {
    	   System.out.println(id);  
           System.out.println(name);
           System.out.println(basic);
      }
   }
   
   public class EmployeeMain2 {
        
      public static void main(String args[]) {
        Employee7 emp=new Employee7(1,"Ashok",3000);  
        emp.displayEmployee();
        // private members are not accessible from other class
        //System.out.println(emp.id);
        //System.out.println(emp.name);
        Employee7 emp2=new Employee7(2,"Nandini",4000);
        emp2.displayEmployee();

      }
    }