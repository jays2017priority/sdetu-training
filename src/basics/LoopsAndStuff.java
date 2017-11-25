package basics;

public class LoopsAndStuff {

	public static void main(String[] args) {
		
		
		String [] states = new String[5];
		//we then put values in them, line by line
		states[0]= "Georgia";
		states[1]= "Florida";
		states[2]="Texas";
		states[3] = "Ohio";
		states[4]= "New York";
		//using a do while loop to print what is in the array
		//THE DO LOOP: enters the loop and then test the condition
		int i = 0;
		
		do{
			System.out.println("STATES: " + states[i]);
			i = i + 1;
		}while(i < 5);
		
		//WHILE LOOP: test the condition first, then enters the loop
		
		System.out.println("***********");
		
		int n = 0;
		
		while(n <=4){//could also have done n < 5
			System.out.println("STATE at " + "n "+ states[n]);
			n++;
		}
		//FOR LOOP: best structure for iterating thru a loop
		
		System.out.println("\nPRINTING WITH A FOR LOOP");
		
		for(int x = 0; x<5; x++){
			
			System.out.println(states[x]);
		}
		
		
	}

}
