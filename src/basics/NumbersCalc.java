package basics;

public class NumbersCalc {
	
	public static void main(String [] args){
		System.out.println("The program is starting");
		
		int numA = 20;
		int numB = 15;
		System.out.println("The product of numA and numB " + numA + " " + numB + " " + multipleNumbers(numA, numB));
		
		
		//this code will call the method or function below
		printName();
		
		addNumbers(numA, numB);
		
		multipleNumbers(numA, numB);
	}
//here I am calling a method or function
	//void means you are not returning anything
		static void printName(){
		
			System.out.println("My name is Jenifer");
			
		}	
		
		static void addNumbers(int numberA, int numberB){
			
			int sum = numberA + numberB;
			System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
			
		}
			
		//This function will add two numbers
			
			
		
		//method or function with a return type
		static int multipleNumbers(int valueA, int valueB){
			
			int product = valueA * valueB;
			
			//here I am calling another function or method inside of another function or method
			addNumbers(product = 50, product);
			
			return product;
		
			
		}
}
