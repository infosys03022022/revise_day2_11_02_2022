package infosys.demo.string;

public class StringDemo2 {
  // == it compares whether both the reference are
// pointing to the same object or not
// equals method , it checks for whether the 
// objects are having same content or not
	public static void main(String[] args) 
	{
	String str0;
	// System.out.println(str0);// stro is a local object and
	// needs to initialised otherwise compilation error
	String str1="Hello";
	// So for line 8, Hello is created in the string pool
	// and is pointed by str1
	String str2="Hello";
	// And when we are writing line 12, it will be 
	// searched whether we have a String constant called
	// Hello. In our case it will find the String literal'
	// in the string pool. So str2 will also point to
	// the same String literal which str1 is pointing
	boolean isEqual=str1==str2;
	System.out.println(isEqual);
	isEqual=str1.equals(str2);
	System.out.println(isEqual);
	
	}

}
