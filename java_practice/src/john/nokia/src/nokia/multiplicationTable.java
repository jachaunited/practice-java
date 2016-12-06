package nokia;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[][] table = new int[number][number];
		
		for(int index = 0; index < number; index++) {
			table[0][index] = index + 1;
			table[index][0] = index + 1;
		}
		
		for(int row = 1; row < number; row++) {
			for(int column = 1; column < number; column++) {
				table[row][column] = table[row][0]*table[0][column];
			}
		}
		
		for(int row = 0; row < number; row++) {
			for(int column = 0; column < number; column++) {
				if(column % number == 0){
					System.out.println();
					System.out.print(table[row][column] + "\t");
				} else {
					System.out.print(table[row][column] + "\t");
				}
			}
		}
		
	}

}
