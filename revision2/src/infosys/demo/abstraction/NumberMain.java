package infosys.demo.abstraction;


public class NumberMain {

public static void main(String[] args) {
   		  Number number=new Number();
   		  number.setNumber1(19);
   		  number.setNumber2(100);
   		  int max=number.maximum();  // we have abstraction for function maximum as 
   		      // from main method we dont know how the maximum method is implemented
   		  System.out.println(max);

	}

}
