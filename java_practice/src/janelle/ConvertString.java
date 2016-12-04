package janelle;

public class ConvertString {
	String[] letterArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	void convertToInt(String word) {
		int[] arr = new int[word.length()];	
		int sum = 0;
		
	    for (int i = 0; i < word.length(); i++) {
	        arr[i] += Character.toLowerCase(word.charAt(i)) - 'a' + 1;
	        sum = sum += arr[i];
	        System.out.println(arr[i]);
	    }
        System.out.println(sum);
	}
	
	public static void main(String[] args) {
		String word = "JANELLE";
		ConvertString newInstance = new ConvertString();
		newInstance.convertToInt(word);
	}
}