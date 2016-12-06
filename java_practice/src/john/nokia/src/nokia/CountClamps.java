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

	/*static int countClamps(int[] arr) {
		int result = 0;
		int nextNext = 0;
		for (int current = 0; current < arr.length - 2; current++) {
			for (int next = current; next <= current + 1; next++) {
				nextNext = next  + 1;
				if(nextNext >= arr.length) {
					nextNext = arr.length -1;
				}
				if (arr[current] == arr[next] && current != next) {
					result++;
					if(arr[next] != arr[nextNext]) {	
					} /(else if(arr[next] == arr[nextNext] && arr.length % 2 == 0) {
						result = 1;
					}
				}
			}
		}
		return result;
	}*/
	
	
	/*static int countClamps(int[] arr) {
	    int result = 0;
	    int prev = 0;
	    boolean same = false;
	    for(int i = 0; i < arr.length; i++) {
	        if (i == 0) {
	            prev = arr[i];
	        } else {
	            if (arr[i] == prev) {
	                if (!same) {
	                    result++;
	                    same = true;
	                }
	            } else {
	                prev = arr[i];
	                same = false;
	            }
	        }
	    }
	    return result;
	}*/
	
	static int countClamps(int[] arr) {
	    int result = 0;
	    for (int i = 1; i < arr.length; ++i) {
	        if (arr[i] == arr[i-1]
	                && (i == arr.length-1 || arr[i] != arr[i+1])) {
	            ++result;
	        }
	    }
	    return result;
	}

}
