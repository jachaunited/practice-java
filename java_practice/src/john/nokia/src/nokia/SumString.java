package nokia;

import java.util.Scanner;

public class SumString {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
//			sum += Integer.parseInt(str.charAt(i));
			sum += (int)str.charAt(i);
		}
		
		System.out.println(sum);
		
		
	}

}
