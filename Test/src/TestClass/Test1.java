package TestClass;

import java.util.Scanner;
class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidAgeException(String s) {
		super(s);
	}
}
public class Test1 {
public static void main(String[] args) throws InvalidAgeException {
	Scanner s=new Scanner(System.in);
	System.out.println("enter age===========");
	int age=s.nextInt();
	if(age <= 18) {
		throw new InvalidAgeException("not eligible for vote");
	}
	
}	
}
