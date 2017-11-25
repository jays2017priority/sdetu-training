package basics;

public class Days {
	
	public static void main(String [] args){
		
		//Will execute different blocks of code based on the value of a condition
		
		String dayOfWeek= "Tuesday";
		//where the if statement can compare many things and many variables, the switch statement can
		//compare only one variable
		
		//with the switch statement, when it finds something that will allow it to evaluate, then 
		//everything after that line of code will be evaluated also. This occurs because everything is 
		//in one block. To stop that from happening, you add a break after each block.
		switch(dayOfWeek){
		case "Monday": 
			System.out.println("It is Monday");
			break;
		case "Tuesday": 
			System.out.println("It is Tuesday");
			break;
		case "Wednesday": 
			System.out.println("It is Wednesday");
			break;
		case "Thursday": 
			System.out.println("It is Thursday");
			break;
		case "Friday": 
			System.out.println("It is Friday");
			break;
		}
		
	}

}
