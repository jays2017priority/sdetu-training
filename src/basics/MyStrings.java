package basics;

public class MyStrings {

		public static void main(String [] args){
			//instance variable
			String toys;
			String huntingFor = " and";
			
			String groupOfStuff = "Legos and Things";
			//testing to see if the item contains the one listed within huntingFor
			if(groupOfStuff.contains(huntingFor)){
				System.out.println("The phrase has a "+ huntingFor + " in it");
			}
			//instance variable
			String tv = "Samsung";
			
			//test to see if the Strings in the tv variable are equals, no matter what the case is
			if(tv.equalsIgnoreCase(tv)){
				
				System.out.println("That's wassup!!");
				
			}
			//instance variables
			String table = "1 or them";
			String chair= "type";
			String printer= "5236144";
			
			//with the substring, you have to begin it with the item you want to print and end it with the item that is one index
			//past the one you want to print
			System.out.print(table.substring(0, 1));
			System.out.print(chair.substring(0, 1));
			System.out.println(printer.substring(0, 5));
			
			
		}
}
