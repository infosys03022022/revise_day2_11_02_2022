   package infosys.demo.classobject;
 
   class Employee6 {
       private int id;      // id, name and basic are instance variables/attributes
       private String name;
       private int basic;
       
       private Employee6(int i, String nm, int b)
       {
    	   id=i;
    	   name=nm;
    	   basic=b;
       }
      
        private void displayEmployee() {
    	   System.out.println(id);  
           System.out.println(name);
           System.out.println(basic);
      }
   }
   
   public class EmployeeMain {
        
      public static void main(String args[]) {
        Employee6 emp=new Employee6(1,"Ashok",3000);  
        emp.displayEmployee();
        System.out.println(emp.id);
        System.out.println(emp.name);
        Employee6 emp2=new Employee6(2,"Nandini",4000);
        emp2.displayEmployee();

      }
    }