package basics;

public class MyArrayOne {

	public static void main(String[] args) {
		//define and declare an array, explicitly putting values in it
		
		int numbers [] = {23,24,5,2};
		//with arrays, remember they are indexed beginning at zero, so this will
		//print out the value at index 0
		
		//will print one of the values in the array
		System.out.println(numbers[2]);
		
		//will print out the rest of the values in this array
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[3]);
		
		//declare and define an array with a specific size
		//remember, you need to have the type of value after the keyword new, NOT the name of the array
		int calories [] = new int [3];
		//I am now adding values to the array
		
		calories[0] = 25;
		calories[1] = 300;
		calories[2] = 50;
		//will print those calories to the screen
		
		System.out.println(calories[0]);
		
		//declare an array
		
		int [] legos;
		
		//defining the same array
		
		legos = new int[3];
		//I am putting values in the array
		legos[0] = 10;
		legos[1] = 5;
		legos[2] = 3;
		
		//printing the values in the array
		
		System.out.println(legos[0]);
		System.out.println(legos[1]);
		System.out.println(legos[2]);
		
		

	}

}
