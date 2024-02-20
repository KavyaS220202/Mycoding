package javabasics;

public class Swapwithvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "Hi! I am Kavya";
      String b = "I am a coder";
      System.out.println("Swapping using variable");
      System.out.println("-----------------------");
      System.out.println("Values before swapping");
      System.out.println("-----------------------");
      System.out.println("Statement a: "+a);
      System.out.println("Statement b: "+b);
      System.out.println("-----------------------");
      System.out.println("-----------------------");
      String temp;
      temp = a;
      a = b;
      b = temp;
      System.out.println("Values after swapping");
      System.out.println("-----------------------");
      System.out.println("Statement a: "+a);
      System.out.println("Statement b: "+b);
      System.out.println("Program done by Kavya S");
      System.out.println("-----------------------");
	}

}
