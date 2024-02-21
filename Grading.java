package javabasics;
import java.util.*;
public class Grading
{
	public static void main(String args[])
	{
		System.out.println("Grading system");
		System.out.println("Enter the total marks obtained out of 600:");
		int marks;
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		System.out.println("Total marks obtained: "+marks);
		int option = 0;
		if(marks >= 550 && marks <= 600)
		{
			
			option = 1;
		}
		else if(marks >= 500 && marks <= 549)
		{
			
			option = 2;
		}
		else if(marks >= 450 && marks <= 499)
		{
			option = 3;
		}
		else if(marks >= 400 && marks <= 449)
		{
		    option = 4;
    	}
		else if(marks >= 350 && marks <= 399)
		{
			option = 5;
		}
		else if(marks <= 349)
		{
			option = 6;
		}
		switch(option)
		{
		case 1:
			System.out.println("Grade A");
			System.out.println("Excellent performance");
			break;
		case 2:
			System.out.println("Grade B");
			System.out.println("Good performance");
			break;
		case 3:
			System.out.println("Grade C");
			System.out.println("Good, but needs improvement");
			break;
		case 4:
			System.out.println("Grade D");
			System.out.println("Average performance");
			break;
		case 5:
			System.out.println("Grade E");
			System.out.println("Below Average performance");
			break;
		case 6:
			System.out.println("Grade F");
			System.out.println("Poor performance");
			break;
			default:
				System.out.println("Enter valid marks");
		}
}
}