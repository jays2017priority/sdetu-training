package basics;


class Person{
	
	//create the instance variables in the Person class
	String name;
	String email;
	String phone;
	
	//create the methods in the Person class
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
		
	}
}


public class DemoClasses {

	public static void main(String[] args) {
		//here I am instantiating a object
		Person person1 = new Person();
		
		//here I am defining some properties
		person1.name = "Jenny";
		person1.email = "something@here";
		person1.phone= "6546556";
		
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		//here I am instantiating another object
		Person person2 = new Person();
		
		person2.name = "Savion";
		person2.walk();
		
		
		

	}

}
