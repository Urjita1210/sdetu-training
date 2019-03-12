package oop;

class Person{
	String name;
	String email;
	String phone;
	
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

public class Demo {

	public static void main(String[] args) {
		//Instantiate an object 
		Person person1=new Person();
		
		//Define some properties
		person1.name="Joe";
		person1.email="Joe@gmail.com";
		person1.phone="6765621335";
	
		//Abstraction
	person1.walk();
	person1.eat();
	person1.sleep();
	
	Person person2=new Person();
	person1.name="Sarah";
	person1.walk();
		
	/*
		//Person
		
		//Attributes,variables,adjectives,descriptors
		String name="Joe";
		String email="Joe@gmail.com";
		String phone="789542336";
		
		//Action,activity,behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name  + " is eating");
		
		//what if we wanted to do this for another person?
		
		String name2="Sarah";
		String email2="Sarah@gmail.com";
		String phone2="7896876556";
		System.out.println(name2 + " is walking");
		System.out.println(name2  + " is eating");
		
	}
	//Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}

}
