package nokia;

public class RowSum {
		
	void getSumRow(int[][] arr) {
		int[] result = new int[arr.length];
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[0].length; column++) {
				result[row] += arr[row][column];
			}
			System.out.println("Row " + row +": " +result[row]);
		}
	}
			
	public static void main(String[] args) {
		
		int[][] arr_1 = {  {0, 1, 2, 3},
                {3, 2, 1, 0},
                {3, 5, -6, -2},
                {3, 8, 3, 4}  };
		int[][] arr_2 = {  {10, 2, 2, 3},
                {-3, 2, 1, -5},
                {3, -5, -6, 1},
                {3, 8, 3, 400}  };
		
		RowSum perform = new RowSum();
		
		perform.getSumRow(arr_1);
		System.out.println();
		perform.getSumRow(arr_2);
		

	}

}
