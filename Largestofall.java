package javabasics;
import java.util.Scanner;
public class Largestofall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a, b, c;
      Scanner sc = new Scanner(System.in);
      System.out.println("To find largest of all numbers");
      System.out.println("------------------------------");
      System.out.println("Value a: ");
      a = sc.nextInt();
      System.out.println("Value b: ");
      b = sc.nextInt();
      System.out.println("Value c: ");
      c = sc.nextInt();
      if(a>b && a>c)
      {
    	  System.out.println("The value a" + " " +a+ " " + " is largest of all the other values");
      }
      else if(b>a && b>c)
      {
    	  System.out.println("The value b" + " " +b+ " " +" is largest of all the  other values");
      }
      else if(c>a && c>b)
      {
    	  System.out.println("The value c" + " " +c+ " " + " is largest of all the other values");
      }
      System.out.println("Program done by Kavya S");
	}

}
