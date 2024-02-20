package javabasics;
import java.util.*;
public class Subjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int tamil, english , maths, computer, physics, chemistry, total;
         System.out.println("To find the total marks of HSC students");
         System.out.println("Marks of each subjects");
         System.out.println("Tamil: ");
         Scanner sc = new Scanner(System.in);
         tamil = sc.nextInt();
         System.out.println("English: ");
         english = sc.nextInt();
         System.out.println("Maths: ");
         maths = sc.nextInt();
         System.out.println("Computer: ");
         computer = sc.nextInt();
         System.out.println("Physics: ");
         physics = sc.nextInt();
         System.out.println("Chemistry: ");
         chemistry = sc.nextInt();
         total = tamil + english + maths + computer + chemistry+ physics;
	     System.out.println("Total marks obtained: "+total+"/"+"600");
	     System.out.println("Program done by Kavya S");
	}
	

}
