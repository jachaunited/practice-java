package janelle;

import java.util.Arrays;

//Given a number get the sum of the numbers from 1 to N that are multiples of 3 and 5.
public class Multiples {
	void multiple(int n) {
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			if((i + 1) % 3 == 0) {
				System.out.println(i + 1+ " is a multiple of 3");
				arr[i] += i+1;
			}
			else if((i + 1) % 5 == 0) {
				System.out.println(i + 1+ " is a multiple of 5");
				arr[i] += i+1;
			}
			sum = sum += arr[i];
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int number = 15;
		Multiples newInstance = new Multiples();
		newInstance.multiple(number);
	}
}
