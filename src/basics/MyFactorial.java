package basics;

public class MyFactorial {

		public static void main(String []args){
			
			System.out.println(fact(5));
			
			
		}
		
		//computing the factorial
		//Definition: n! = n*(n-1)! , where 0! = 1
		//1! = 1
		//2! = 2 * 1! = 2 * 1
		//3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		//4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
		//Hint: use the recursive method that was used to calculate Fibonnaci number
		
		public static int fact(int n){
			
			if(n== 0){
				return 1;
			}
			else if(n ==1){
				return 1;
			}
			//here I did not need to write fact(n) * fact(n-1)
			return ((n) * fact(n-1));
		}
}
