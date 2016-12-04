package nokia;

public class CountClamps {

	public static void main(String[] args) {
		int[] test_arr1 = { 1, 2, 2, 3, 4, 4, 2 };
		int[] test_arr2 = { 2, 2, 3, 4, 4 };
		int[] test_arr3 = { 1, 1, 1, 1, 1, 1 };
		int[] test_arr4 = { 1, 2, 3, 2, 4 };

		System.out.println(countClamps(test_arr1));
		System.out.println(countClamps(test_arr2));
		System.out.println(countClamps(test_arr3));
		System.out.println(countClamps(test_arr4));

	}

	static int countClamps(int[] arr) {
		int result = 0;
		int nextNext = 0;
		for (int current = 0; current < arr.length - 1; current++) {
			for (int next = current; next <= current + 1; next++) {
				nextNext = next  + 1;
				if(nextNext >= arr.length) {
					nextNext = arr.length -1;
				}
				if (arr[current] == arr[next] && current != next) {
//					if(arr[next] != arr[nextNext]) {
						result++;	
//					} else if(arr[next] == arr[nextNext] && arr.length % 2 == 0) {
//						result = 1;
//					}
				}
			}
		}
		return result;
	}

}
