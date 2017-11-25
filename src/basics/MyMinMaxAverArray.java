package basics;

public class MyMinMaxAverArray {

	public static void main(String[] args){
		
		int [] values = { 2, 4, 8, 10,12};
		
	MyMinMaxAverArray can = new MyMinMaxAverArray();
	
	can.min(values);
		
		
		
		
	
				
		
		
	
	
	//Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
	//Hint: this should be static functions with a return type of the same data type as the array declaration.
	int i= 0;
	public int min(int[] a){
		
		for(int x = 0; x < values.length; x++){
			for(int k = 0; k < values.length - x; k++){
				if(values[k]< values[k-1]){
					i = values[k-1];
					return i;
				}
			}
		}
		
		
	}	
	}	
		
}
