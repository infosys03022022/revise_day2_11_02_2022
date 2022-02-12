package infosys.demo.classobject;

import java.util.Scanner;

public class StudentMain {
     public static void main(String args[]){
        Student student1=new Student();
        Student student2=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the roll");
        int roll=scanner.nextInt();
        student1.setRoll(roll);
        System.out.println("Enter the name");
        String name=scanner.next();
        student1.setName(name);
        System.out.println("Enter the marks");
        int marks=scanner.nextInt();
        student1.setMarks(marks);
        System.out.println("The details of student1");
        System.out.println(student1.getRoll());
        name=student1.getName();
        System.out.println(name);
        marks=student1.getMarks();
        System.out.println(marks);
        System.out.println("Enter the roll");
        roll=scanner.nextInt();
        student2.setRoll(roll);
        System.out.println("Enter the name");
         name=scanner.next();
        student2.setName(name);
       /* System.out.println("Enter the marks");
         marks=scanner.nextInt();
        student2.setMarks(marks); */
        System.out.println("The details of student2");
        System.out.println(student2.getRoll());
        name=student2.getName();
        System.out.println(name);
       /* marks=student1.getMarks();
        System.out.println(marks);  */
     }
   }

