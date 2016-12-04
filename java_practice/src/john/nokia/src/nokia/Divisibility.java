package nokia;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		
		for(int i = 0; i <= number; i++) {
			if(i % 7 == 0 && i % 4 != 0) {
				System.out.println(i + " is divisble by 7 only");
			} else if (i % 4 == 0 && i % 7 != 0) {
				System.out.println(i + " is divisble by 4 only");
			} else if (i % 7 == 0 && i % 4 == 0) {
				System.out.println(i + " is both divisble by 7 and 4");
			} else {
				System.out.println(i + " is both not divisble by 7 and 4");
			}
		}
		
		for(int i = 0; i <= number; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		
		System.out.println(result + " sum of " + number +" divisble by 3 and 5");

	}

}
