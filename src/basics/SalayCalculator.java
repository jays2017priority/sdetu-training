package basics;

public class SalayCalculator {

	public static void main(String [] args){
		
		//Let's create a variable to define our career
		
		//declare a variable
		
		String career;
		
		System.out.println("Program is starting");
		
		//defined a variable
		career = "Software Developer";
		System.out.println("My career is " + career);
		
		//declare and define
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My annual salary as a "+ career + " is " + salary);
		
		
		
		
		//Compute our annual salary
		//rate * hours per week * weeks per year
		
	}
}
