package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on weather
		
		int temprature=12;
		String suncondition="sunny";
		
		if(temprature > 80 ) {
			System.out.println("Its pleasant.wear shorts");
		}
		else if((temprature >60) && (suncondition=="sunny")){
			System.out.println("Its a little cooler.Wear long sleeves");
			System.out.println("wear a hat");
		}else if((temprature > 50) || (suncondition=="overcast")) {
			System.out.println("this is a cool day,wear warm clothes");
		}
		else {
			System.out.println("cold day,wear sweater");
		}
		System.out.println("the program is ending");
	}

}
