package infosys.demo.classobject;

import java.util.Scanner;

public class Demo6 {
// Local variables need to be initialised before having access to it. So in our case
// we have not initialised num and we have started accessing in line 8
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int num;
        System.out.println("Plz enter the num");
		num=scan.nextInt();
	System.out.println(num);

	}

}
