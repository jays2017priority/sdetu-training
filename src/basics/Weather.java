package basics;

public class Weather {

		public static void main(String [] args){
			
			//This program will give suggestions on what to wear, based on the weather(temperature and sun condition)
			
			//variable was defined here
			//can change the temperature variable here, to try out the different conditions
			int temperature = 55;
			String sunCondition = "Overcast";
			
			//this if is done if the temp is over 80 and the sunCondition is equivalent to sunny
			if(temperature > 80 && (sunCondition == "Sunny")){
				
				System.out.println("It's pleasant. Wear shorts and t-shirts");
				System.out.println("Wear a hat to keep the sun out of your eyes");
				
			}
			else if(temperature >60){
				
				System.out.println("It is a bit cooler. Wear long sleeve and jeans");
			}
			else if((temperature > 50) || (sunCondition == "Overcast")){
				System.out.println("This is a cool day, make sure to wear warmer clothes");
				
				
			}
			else{
				
				System.out.println("Looks like a cold day.  Bring a sweater");
			}
			System.out.println("The program is ending");
			
		}
}
