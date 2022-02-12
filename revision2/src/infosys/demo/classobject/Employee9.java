package infosys.demo.classobject;
 
   class Employee9 {
       private int id;      
       private String name;
       private int basic;
       
       public Employee9(int i, String nm, int b)
       {
    	   id=i;
    	   name=nm;
    	   basic=b;
       }
      
       public void displayEmployee() {
    	   System.out.println(id);  
           System.out.println(name);
           System.out.println(basic);
      }
   }
   