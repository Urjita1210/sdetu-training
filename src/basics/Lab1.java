package basics;

public class Lab1 {

	public static void main(String[] args) {
		//Write a function that takes a value n and return sum from 1 to n
		System.out.println(Lab1.sum(4));

		//Write a function that computes factorial (hint: use recursion)
		System.out.println("Factorial: " + Lab1.fact(6));
		
		//Write three functions that return the min,avg,max of an array
		int[] numbers= {5, -2, 0, 234, -438, 63};
	
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Avg: " + findAvg(numbers));
		
	}
	public static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int findAvg(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
	}
	public static int sum(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.print(sum + "+" + i);
			sum=sum+i;
			System.out.println(" = " + sum);
			
		}
		return sum;
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
		}
		System.out.println(n);
		return fact(n-1)*n;
		
	}
	

}
