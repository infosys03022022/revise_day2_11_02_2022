package infosys.demo.string;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String str1="Hello";
		// Hello is a string literal/constant and
		// it is an object and str1 is holding the
		// address of the String literal
		String str2=new String("Hello");
		// Here we created a String object with 
		// new keyword and passed the String as
		// a parameter to the constructor
		System.out.println(str1);  // Hello
		System.out.println(str2);  // Hello
				

	}

}
