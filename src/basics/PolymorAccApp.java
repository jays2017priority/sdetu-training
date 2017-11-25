package basics;


//with polymorphism, you could have the same method name, but different code, depending on the parameter, eg, no parameter,
//one parameter, or two parameters.  These could all have the same method name
//polymorphism can occur thru overloading and overriding
public class PolymorAccApp {
	
	public static void main(String []args){
		
		EncapBank la = new EncapBank();
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(3);
		
		//Polymorphism changes where we are pointing, where we are creating a variable based on the interface class, but
		//it will point to the EncapBank class
		InterfaceRate acct3 = new EncapBank();
		acct3.increaseRate();
		acct3.setRate();
	}

}
