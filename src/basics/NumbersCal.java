package basics;

public class NumbersCal {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA=10;
		int numB=20;
		addNumbers(numA,numB);
		int product=multiplyNumbers(numA,numB);
		System.out.println("The product of the numbers" + numA + "&" + numB + "is" + product);

	}
	static void printName() {
		System.out.println("My name is Tim");
		
	}
	static void addNumbers(int numberA,int numberB) {
		//This fumction will add two nos
		int sum=numberA + numberB;
		System.out.println("The sum of nos"+ numberA + "&" +numberB + "is sum");
	}
	static int multiplyNumbers(int valueA,int valueB) {
		int product=valueA*valueB;
		addNumbers(product + 50 , product);
		return product;
	}

}
