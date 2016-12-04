package nokia;

public class ArrayConcatenation {
	
	public static void main(String[] args) {
//		int[] iArr = {1,2,3,4,5};
		String[] sArr = {"a","b","c","d","e"};
		String result = "";
		
		
		for(int i = 0; i < 5; i++) {
			result += sArr[i] + i;
		}
		
		System.out.println(result);
		
	}

}
