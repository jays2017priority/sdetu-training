package basics;

public class Cities {

	public static void main(String[] args) {
		//Define and declare an array
		
		String [] cities = {"Dallas", "Fort Worth", "San Antonio", "Mansfield"};
		//with arrays, remember they are indexed beginning at zero, so this will
		//print out the value at index 0
		System.out.println(cities[0]);
		//the rest of the values in the array
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare and define an array, with a specific size
		
		String [] states = new String[5];
		//we then put values in them, line by line
		states[0]= "Georgia";
		states[1]= "Florida";
		states[2]="Texas";
		states[3] = "Ohio";
		states[4]= "New York";
		//here I can print the value at a particular index
		System.out.println(states[3]);
		
		//declare the array
		
		String [] countries;
		
		//define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Mexico";
		countries[2] = "Germany";
		//print one of the elements in the array
		
		System.out.println(countries[2]);
		
		
		

	}

}
