import java.util.Scanner;


public class Lab1 {

	
	
	public static void main(String[] args){
		
		
		
		String name;
		int yearBorn = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Hey what is your name?");
		name = input.next();
		
		System.out.println("What is your birth year?");
		yearBorn = input.nextInt();
		
		
		int age = (2015-yearBorn);			
		System.out.printf("Hello %s you're %d year-old today", name, age);
		
		
	}
	
	
	
}
