package infosys.demo.classobject;
 
   class Employee8 {
       private int id;      
       private String name;
       private int basic;
       
       Employee8(int i, String nm, int b)
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
   