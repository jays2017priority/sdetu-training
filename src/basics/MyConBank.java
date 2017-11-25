package basics;

public class MyConBank {
	
	//these are my variables
	String pink;
	String gray;
	String brick;
	String straw;
	String wood;
	
	//this is a constructor with no parameters or overloading
	
	MyConBank(){
		
		System.out.println("The story begins");
	}

	//this is a overloaded constructor, which means it has the same name, but different parameter
	MyConBank(String pink){
		
		System.out.println("The first animal is a " + pink);
	}
	
	//this is the second overloaded constructor
	MyConBank(String gray, String brick){
		
		System.out.println("The " + gray + " blew the " + brick + " down");
	}
}
