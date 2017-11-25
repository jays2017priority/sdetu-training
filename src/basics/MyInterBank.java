package basics;

public class MyInterBank implements MyInterface {
	
	String cars;
	String legos;
	String chairs;
	
	
	public void furn(){
		
		System.out.println("I sit in this");
	}
	
	public void riding(){
		System.out.println("I ride in this");
	}

	
	public void play() {
		System.out.println("I want to see play method from interface");
		
	}

	
	public void use() {
		System.out.println("I want to see use method from interface");
		
	}

}
