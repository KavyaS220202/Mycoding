package javabasics;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double breadth, height, area;
        double a,b,c,perimeter;
        System.out.println("Finding the area and perimeter of triangle");
        System.out.println("Finding the area of triangle");
        System.out.println("Enter the breadth: ");
        Scanner sc = new Scanner(System.in);
        breadth = sc.nextInt();
        System.out.println("Enter the height: ");
        height = sc.nextInt();
        area = 1 * breadth * height / 2;
        System.out.println("Area of the triangle: "+area);
        System.out.println("Finding the perimeter");
        System.out.println("Enter the values of three sides: ");
        System.out.println("a: ");
        a = sc.nextInt();
        System.out.println("b: ");
        b = sc.nextInt();
        System.out.println("c: ");
        c = sc.nextInt();
        perimeter = a + b + c;
        System.out.println("Perimeter of the triangle: "+perimeter);
        System.out.println("Program done by Kavya S");
	}

}
