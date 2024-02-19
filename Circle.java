package javabasics;
import java.util.*;
public class Circle {
      public static void main(String args[])
      {
    	  double radius;
    	  double area,perimeter;
    	  System.out.println("Finding the area and perimeter of circle");
    	  System.out.println("Enter the radius value: ");
    	  Scanner sc = new Scanner(System.in);
    	  radius = sc.nextInt();
    	  area = (22 * radius * radius)/7;
    	  perimeter = 2 * 22 * radius / 7;
    	  System.out.println("Area of circle: "+area);
    	  System.out.println("Perimeter of circle: "+perimeter);
    	  System.out.println("Program done by Kavya S");
    	  }
}
