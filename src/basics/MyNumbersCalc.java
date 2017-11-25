package basics;

class Bank{
	//method with a parameter to multiply a number by 2
	public void mutliply(int value){
		value = value*2;
		System.out.println(value);
		
	}
	//method with no parameter to print my name
	public void name(){
		
		System.out.println("My name is Jenifer");
	}
	//method with a parameter to add numbers up and print to the screen
	public void add(int value2, int value3){
		
		int adding = value2 + value3;
		
		System.out.println(adding);
	}
	//method with no return value and parameters, that will do subtraction
	public void subtract(int value2, int value3){
		int minus= value2- value3;
		System.out.println(minus);
	}
	//method with a return value
	public int count(int value4){
		value4= 3 + value4;
		return value4;
		
	}
}
//my main mehtod
public class MyNumbersCalc {
	public static void main(String [] args){
		//object creation
		Bank person = new Bank();
		//using the methods
		person.add(2, 20);
		
		person.name();
		
		person.subtract(20, 5);
		//this is a method with a return value, I had to make it a variable  so I could use it
		//in the next line of code
		
		int total= person.count(3);
		//here is where I had to tell the system to print the return value to the screen
		System.out.println(total);
		
	}
}
