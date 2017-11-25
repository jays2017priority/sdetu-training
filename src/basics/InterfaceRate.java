package basics;


//interfaces just create the outline for what is needed, and will leave the implementation up to the user
//eg, you just write the method in the interface, but you make it do whatever you want in the class where that 
//method is implemented

//remember to write the "interface" keyword in the interface class you are creating, eg public interface InterfaceRate
//can go to the EncapBank program so that I could use the methods below.  I first go to that program, and add "implement 
//InterfaceRate so these two methods can be used.  I then write in those methods from the interface, into the EncapBank class

//those methods are then called in the "main class" thru the use of an object
public interface InterfaceRate {

	public void setRate();
	public void increaseRate();
	
}
//multiple classes can implement a interface at the same time.