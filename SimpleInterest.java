package javabasics;
import java.util.*;
public class SimpleInterest {
  public static void main(String args[])
  {
	  double principal, rate, time,simple_interest;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Finding simple interest");
	  System.out.println("Enter the principal value: ");
	  principal = sc.nextDouble();
	  System.out.println("Enter the rate value in percentage: ");
	  rate = sc.nextDouble();
	  System.out.println("Enter the time in years: ");
	  time = sc.nextDouble();
	  simple_interest = (principal * rate * time) / 100;
     System.out.println("Simple interest: "+simple_interest);
      System.out.println("Program done by Kavya S"); 
}
}
