package oop;

public class BankAccountApp {

	public static void main(String[] args) {
	
		BankAccount acc1=new BankAccount();
		BankAccount acc2=new BankAccount("Checking Account");
		
		//with encapsulation: public API methods
		//In encapsulation the main aim is hiding the data so we do this by making the variables as 
		//private and then access it using public methods as below:
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
	}

}
