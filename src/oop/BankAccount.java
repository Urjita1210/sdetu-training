package oop;

public class BankAccount {

	String accountnumber;
	private String name;
	String ssn;
	String routingNumber;
	String accountType;
	
	//Constructor definitions:unique methods
	//1. they are used to initialize properties of an object
	//2. Constructors are IMPLICITLY called upon INSTANTIATION
	//3. The same name as the class itself
	//4. constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading:call some method name with different arguments
	BankAccount(String accountType){
		 System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	//Getters and setters 
	//Allow the user to define the name
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	//Define methods
	void deposit() {
		
	}
	void withdraw() {
		
	}
	void checkBalance() {
		
	}
	void getStatus() {
		
	}
	
}
