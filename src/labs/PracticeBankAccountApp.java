package labs;

public class PracticeBankAccountApp {
	
	public static void main (String [] args){
		
		BankAccount acct2 = new BankAccount("465622566", 1000);
		BankAccount acct3 = new BankAccount("326871262", 2000);
		BankAccount acct4 = new BankAccount("782016397", 3000);
		
		
		//using all of these methods is abstraction
		acct2.setName("Annie");
		System.out.println(acct2.getName());
		
		acct2.makeDeposit(500);
		acct2.makeDeposit(600);
		acct2.payBill(1000);
		acct2.accrue();
		System.out.println(acct2.toString());
		
	}

}

class BankAccount implements InterfaceInterest {
	
	//Properties of bank account
	//by making them private, it means we are using encapsulati+on, so the client does not have access to the variable, they
	//will only be able to access the methods that use these variables
	
	//this static variable is a part of the class, not part of the object
	private static int ID= 1000;//internal ID
	private String accountNumber;//will be ID + random 2-digit number + first 2 SSN
	
	//it is static, because it will be the same for the whole class or all accounts, and it is final so that it can't be
	//changed
	private static final String routingNumber = "423997168";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor, will be called(instantiated) when the object acct2 is created above
	//the SSN will be used to generate an account number. The constructor has to have 2 parameters
	public BankAccount(String SSN, double initDeposit){
		balance = initDeposit;
		
		//above I have the this.SSN = SSN, where the this.SSN is refering to the instance variable.  I set that equal to the
		//SSN that is a part of the local parameter of the constructor
		this.SSN = SSN;
		
		//this will increment the value of the ID each time the constructor is called
		ID++;
		System.out.println(ID);
		//I am using this method inside of the constructor, don't need an object to be made to do this
		setAccountNumber();
	}
	//more encapsulation, here I don't want the client to have access to creaating their own bank account. I want to 
	//be in control of that activity
	
	private void setAccountNumber(){
		//math.random will generate a value between 0 and 1, so we then multiply by 100 to calculate a random 2 digit number
		//this would return a double, so we cast it as a integer because our random variable is a integer
		//I think the Math.random is a hard coded method in java
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		
		 //here I coded the SSN.substring(0,2) to get the two values of the social to put in the account number
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Your account number: " + accountNumber);
	}
	
	
	public void setName(String name){
		//here the this.name refers to the instance variable, and the name written by itself refers to the parameter in 
		//the setName method
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	//needs a parameter, because that is the value you are using to pay bill with
	public void payBill(double amount){
		
		balance = balance - amount;
		System.out.println("Paying bill " + amount);
		//in this call to the method, don't need to have a instance variable or object before it
		showBalance();
	}
	
	//needs a parameter because that is the balance you are using to make a deposit with
	public void makeDeposit(double amount){
		System.out.println("Making a deposit " + amount);
		balance = balance + amount;
		//in this call to the method, don't need to have a instance variable or object before it
		//and it will print the balance
		showBalance();
		
	}
	//this will print the balance each time
	public void showBalance(){
		
		System.out.println("The new balance is: " + balance);
	}
	public void accrueInterest(){
		
	}

	//I think this is inheritance also
	@Override 
	//this method came from and value came from the InterfaceInterest interface.  Did not have to do it this way, but 
	//wanted to show how to use a interface.  
	public void accrue() {
		balance = balance * (1+rate/100);
	
		//in this call to the method, don't need to have a instance variable or object before it
		//and it will print the balance
		showBalance();
		
	}
	//this is inheritance I think
	@Override
	public String toString(){
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";  
		
	}
}

