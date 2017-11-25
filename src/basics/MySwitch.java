package basics;

public class MySwitch {
	public static void main(String [] args){
		
		//here is where you enter your variable
		
		//you can change the variable number to make various switch cases occur
		int number = 4;
		
		
		switch(number){
		
		case 1:
			System.out.println("the number is 1");
			break;
			
		case 2:
			System.out.println("the number is 2");
			break;
			
		case 3:
			System.out.println("the number is 3");
			break;
		default: System.out.println("the case ends");
		}
	}

}
