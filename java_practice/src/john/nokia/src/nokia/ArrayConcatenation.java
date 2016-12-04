package nokia;

public class ArrayConcatenation {
	
	String arrayConcatenate(int[] iArr, char[] cArr) {
		
		String result = "";
		
		for(int i = 0; i < 5; i++) {
			result += cArr[i] + Integer.toString(iArr[i]);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] iArr = {1,2,3,4,5};
		char[] cArr = {'a','b','c','d','e'};		
		
		ArrayConcatenation perform = new ArrayConcatenation();
		
		System.out.println(perform.arrayConcatenate(iArr, cArr));
		
	}

}
