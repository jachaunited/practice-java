package janelle;

//Check if input number is divisble by 7 or 4 or both.
public class Divisibility {
	void divisble(int n) {
		if(n % 4 == 0 && n % 7 == 0) {
			System.out.println(n + " is divisble by 7 and 4");
		}
		else if(n % 7 == 0) {
			System.out.println(n + " is divisble by 7");
			
		}
		else if(n % 4 == 0) {
			System.out.println(n + " is divisble by 4");
		}
		else {
			System.out.println(n + " is not divisble by 7 or 4");
		}
		
	}
	
	public static void main(String[] args) {
		int number = 1;
		Divisibility newInstance = new Divisibility();
		newInstance.divisble(number);
	}
}
