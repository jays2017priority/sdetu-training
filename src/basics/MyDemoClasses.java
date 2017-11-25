package basics;

class People{
	
	String name;
	int weight;
	int height;
	
	void call(){
		
		System.out.println(name + " is my name");
	}
	
	void size(){
		System.out.println(weight + " is my weight");
	}
	
	void tall(){
		System.out.println(height + " is my height");
	}
}



public class MyDemoClasses {
	
	public static void main(String [] args){
		//here I instantiate the object
		People person1 = new People();
		
		//here I give value to instanc variables
		person1.name = "Savion";
		person1.weight = 60;
		person1.height = 48;
		
		//Abstraction
		//I am making a call on the method with the object
		person1.call();
		person1.size();
		person1.tall();
		
		//instantiating a new object
		
		People person2 = new People();
		
		//giving the instance variable meaning
		person2.name = "Adam";
		//using abstraction
		//using the method
		person2.call();
		
		
	}

}
