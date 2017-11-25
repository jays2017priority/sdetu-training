package basics;

public class MyLoopsAndStuff {
	
	public static void main(String [] args){
		
		int [] value  = new int[4];
		
		value [0] = 25;
		value [1] = 30;
		value [2] = 35;
		value [3] = 40;
		
		int i = 0;
		
		do{
			System.out.println(value[i]);
			i++;
		}while(i < 4);
		
		
		int x = 0;
		while(x < 3){
			
			System.out.println("The values " + value[x]);
			x++;
		}
		
		for(int z = 0; z < 4; z++)
			
			System.out.println("made with the for loop " + value[z]);
		
	}

}
