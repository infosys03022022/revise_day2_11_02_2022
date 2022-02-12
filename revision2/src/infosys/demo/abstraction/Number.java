package infosys.demo.abstraction;

public class Number {
   private int number1;
   private int number2;
   
   
public Number() {
	  this(0, 0);
}


public Number(int number1, int number2) {
	
	this.number1 = number1;
	this.number2 = number2;
}


public int getNumber1() {
	return number1;
}


public void setNumber1(int number1) {
	this.number1 = number1;
}


public int getNumber2() {
	return number2;
}


public void setNumber2(int number2) {
	this.number2 = number2;
}

// Display the number which is maximum
 public int maximum()
 {
	/* if(number1>number2)
		 
	 {
		 return number1;
	 }
	 return number2;
    */
   return (number1>number2)?number1:number2;
 }
 }
