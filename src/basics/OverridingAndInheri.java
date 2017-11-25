package basics;

public class OverridingAndInheri {
	
	public static void main(String [] args){
		
		OverAndInheri acc1 = new OverAndInheri ();
		
		
		acc1.name = "Jenny";
		acc1.accountNumber = "4452862";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		
		OverAndInheri acc2 = new OverAndInheri("Checking Account");
		
		OverAndInheri acc3 = new OverAndInheri("Saving Account", 5000);
		
		//the static variable routingNumber is used by the whole class
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		//Demo for inheritance
		
		OverCdAcc  cd1 = new OverCdAcc();
		cd1.balance = 5000;
		cd1.interestRate = "4.5";
		cd1.name = "Jim";
		cd1.accountType = "CD Account";
		cd1.compound();
		
		System.out.println(cd1.toString());
		
	}

}
