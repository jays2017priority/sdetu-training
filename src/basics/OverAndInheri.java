package basics;

public class OverAndInheri {

	
	//local variables are defined within a method or block of loop statements
		//define variables
		String accountNumber;
		String name;
		int balance;
		//static belongs to the class, not to the object instance
		//final constant (often static final)
		static final String routingNumber = "454545";
		String ssn;
		String accountType;
		
		//Constructor definitions: unique methods
		//1. They are used to define/setup/or initialize properties of an object
		//2. Constructors are IMPLICITELY called upon instantiation, meaning we don't have to write code to call it, it is
		//called when we create an object for this class, and the object is accl. The object is created in the Constructors class
		//3. The constructor will have the same name as the clsss it is in, in this case it is ConstructorBankAccount()
		//4. Constructors have no return type at all, e.g. there is no void, int, or double for the return type
		
		//here, we make the constructor do something, to see how it is implicitely called from the object in the Constructor class
		OverAndInheri(){
			System.out.println("This is a test");
			}
		
		//Overloading: Call the same method name, with different arguments, you can also do this with constuctors
		
		//here the method is overloading, the only way it can be used is if were were to make a object in the Constructor 
		//class that has a parameter.  The first object does not have a parameter. So if we were to not write one with
		//parameters, the constructor below would never be implicitely instantiated or used
		OverAndInheri(String accountType){
			System.out.println("New Account" + accountType);
		}
		
		
		OverAndInheri(String accountType, double initDeposit){
			System.out.println("New Account" + accountType);
			System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
			
		}
		
		//Overriding the toString() method
		@Override
		public String toString(){
			
			return "[" + name + " ." + accountNumber + " . Balance: $ " + balance + "] ";
		}
}
