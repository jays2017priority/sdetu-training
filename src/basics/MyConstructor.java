package basics;

public class MyConstructor {
	
	public static void main(String [] args){
		
		//these are the objects, they must have the same name as the location of the Constructor
		MyConBank anim1 = new MyConBank();
		
		MyConBank anim2 = new MyConBank("pig");
		
		MyConBank anim3 = new MyConBank("wolf", "house");
	}

}
