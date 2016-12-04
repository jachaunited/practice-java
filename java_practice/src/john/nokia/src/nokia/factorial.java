package nokia;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		
		if(number < 0) {
			System.out.println("Your input is less than 0");
		} else {
			result = factorial(number);
		}
		
		System.out.println(result);
		
	}
	
	static int factorial(int number) {
		if(number == 0 || number == 1){
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
	

}
