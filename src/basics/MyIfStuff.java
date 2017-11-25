package basics;

public class MyIfStuff {
	
	public static void main(String [] args){
		//initialize the variables here, you can change these items to test out the if else statements.
		int bank=500;
		String money= "green";
		
		//nested if statements is the same as using the && operator
		
		
		//here you test to see what happens if the value is less than 400
		if(bank < 400){
			
			System.out.println("The funds are too low");
		
		}
		//if the variable is more than 400, this occurs
		else {
			System.out.println("I am rich, woohoo");
		}
		//here you test to see if the variable is less than 400 and if the value of money is equilvalent to the
		//the color blue
		if((bank < 400) && (money =="green")){
			System.out.println("I am broke, but I still got something");
		}
		
		//here you test to see if the value of bank is less than 400 OR the value of money is equilvalent to
		//the color blue
		else if((bank < 400) || (money == "green")){
			
			System.out.println("Well at least I have something, although it ain't much");
		}
		//I did not have to add the else statement at the bottom, but I did, just to have something
		//to do for when the if statement does not evaluate.
		if((bank >400) && (money!="green")){
			
			System.out.println("What have we here?");
		}
	
		else{
			System.out.println("Where do we go from here");
		}
		
	}	

}
