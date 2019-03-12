package basics;

public class cities {
	public static void main(String[] args) {
		//Declare & define an array
		String[] cities={"mumbai","Pune","Chennai"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
	
    //Declare & define an array(only size)
	String[] states=new String[3];
	states[0]="goa";
	states[1]="UP";
	states[2]="Kerala";
	int i=0;
	
	//Do loop:enters the loop then tests the condition
	do {
		System.out.println("State: " + states[i]);
		i=i+1;
	}while(i<3);

	
	//While loop:checks the condition first then enters the loop
	int n=0;
	boolean statefound=false;
	while(!statefound) {
		String state=states[n];
		System.out.println(state);
		if(state=="UP") {
			System.out.println("state found!");
			statefound=true;
		}
		n++;
	}
	System.out.println("\n printing with for loop\n");
	//best structure for iterating through an array
	for(int x=0;x<3;x++) {
		System.out.println(states[x]);
		}
	}
	
	
	}



