
public class recursion {
	
	public static void funky (int x){
		if (x > 0 ){
			x--;
			funky(x);
		}
		System.out.printf("%d", x);
	}
	
	/*public int tester(){
		funky(5);
		return 0;
	}*/
	
	public static void main(String args[]){
		funky(5);
	}

}
