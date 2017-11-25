package basics;

public class Constructors {
	
	public static void main (String []args){
		
		//Creating a new bank account, think instantiate a new object
		//these methods are all examples of polymorphism, same method name, but different parameters
		ConstructorBankAccount acc1 = new ConstructorBankAccount();
		
		ConstructorBankAccount acc2 = new ConstructorBankAccount("Checking Account");
		
		ConstructorBankAccount acc3 = new ConstructorBankAccount("Saving Account", 5000);
		
		//the static variable routingNumber is used by the whole class
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
	}

}
