package basics;

public class MyFib {
	
	public static void main(String [] args){
		
	
	
	//The fibonaccie sequence
	// The fibonacci number is defined by the sum of the 2 previous numbers	
	//fib(0)= 0
	//fib(1)= 1
	//fib(2) = fib(0) + fib(1)= 0 + 1
	//fib(3) = fib(2) + fib(1)= 1 + 1= 2
	//fib(4) = fib(3) + fib(2) = 2 + 1 = 3
	//fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		//here, I will print the number to the screen
		System.out.println(fib(10));
		
	}
	//here is where I make the method
	//I need the parameter, so I could pass in the value, when the method is called
		public static int fib( int n){
		
			//here I test if the value passed in in the main method is 0
			if(n ==0){
				return 0;
			}
			//here, I test if the value passed in the main method is 1
			else if(n== 1){
				return 1;
			}
			//here I test any value entered that is not a 0 or 1, can test more than the number 5
			int x = (fib(n-1) + fib(n-2));
			//System.out.println(fib(n-1));
			return x;
		}	
	
}
	
	
