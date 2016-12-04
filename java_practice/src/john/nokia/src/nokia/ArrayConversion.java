package nokia;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {

	int[] convert(int[][] arr) {
		int newArrLength = arr.length * arr[0].length;
		int[] newArr = new int[newArrLength];
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[0].length; column++) {
				newArr[(row * arr[0].length) + column] = arr[row][column];
			}
		}
		return newArr;
	}

	int[] useGenericsConvert(int[][] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int newArrLength = arr.length * arr[0].length;
		int[] newArr = new int[newArrLength];
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				list.add(arr[row][column]);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			newArr[i] = list.get(i);
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 2, 3 }, 
				{ 3, 2, 1, 0 }, 
				{ 3, 5, 6, 1 }, 
				{ 3, 8, 3, 4 } };
		
		ArrayConversion perform = new ArrayConversion();
		int[] newArr_1 = perform.convert(arr);
		int[] newArr_2 = perform.useGenericsConvert(arr);

		for (int index = 0; index < newArr_1.length; index++) {
			System.out.print(newArr_1[index] + " ");
		}
		
		System.out.println();
		
		for (int index = 0; index < newArr_1.length; index++) {
			System.out.print(newArr_2[index] + " ");
		}

	}

}
