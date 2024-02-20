package javabasics;
import java.util.*;
public class Swapwithoutvariable {
  public static void main(String[] args)
  {
	  int a,b;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Swapping values without using a third variable");
	  System.out.println("-----------------------------------------------");
	  System.out.println("Value a: ");
	  a = sc.nextInt();
	  System.out.println("Value b: ");
	  b = sc.nextInt();
	  System.out.println("Values before swapping");
	  System.out.println("-----------------------");
	  System.out.println("Value a: "+a);
	  System.out.println("Value b: "+b);
	  System.out.println("Values after swapping");
	  System.out.println("-----------------------");
	  a = a*b;
	  b = a/b;
	  a = a/b;
	  System.out.println("Value a: "+a);
	  System.out.println("Value b: "+b);
	  System.out.println("Program done by Kavya S");
  }
}
