package basics;

public class Strings {
	
	public static void main(String [] args){
		
		String bookTitle;
		String wordChoice = "Rings";
		
		bookTitle = "The Lord of the Rings";
		
		//method will check to see if the variable has the same name as the other variable
		if(bookTitle.contains(wordChoice)){
			System.out.println("the book contains the word Rings" + wordChoice);
			
		}
		
		String browser = "Chrome";
		
		//the equalsIgnoreCase will ignore the fact that the word is "Chrome" or "chrome", it is ignoring the uppercase/lowercase
		//because you can't write browser == "chrome" because that "chrome" would have to be uppercase!!
		if(browser.equalsIgnoreCase(browser)){
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Jenifer";
		String lastName = "Lester";
		String ssn = "145164154";
		
		//will give you the length in a string
		
		//Print the initials and the last 4 of ssn
		//the substring will allow you to find certain values in a String
		System.out.print(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(ssn.substring(0, 5));
	}

}
