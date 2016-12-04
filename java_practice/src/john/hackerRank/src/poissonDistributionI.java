

public class poissonDistributionI {

	public static void main(String[] args) {
		final double probability = 2.5;
		final double k = 5;
		double e = 2.71828;

		/*System.out.println(power(probability,k));
    	System.out.println(power(e,probability));
    	System.out.println(1/power(e,probability));
    	System.out.println(factorial(k));*/

		/*for(int i = 1; i < probability; i++) {
        e = e * e ;
        System.out.println(e);
    	}*/

		/*System.out.println(Math.pow(e, probability));
   		System.out.println((double) 1/Math.pow(e, probability));*/

		System.out.printf("%.3f", power(probability,k) * 1/Math.pow(e,probability) / factorial(k));
	}

	public static double power(double n, double k) {
		/*double result = n;
    if (k > 0) {
        for(int i = 1; i < k; i++) {
            result *= n;
        }
        return result;
    } else if (k < 0) {
        for(int i = 1; i < k; i++) {
            result *= n;
        }
        return result = 1/result;
    } else
        return result = 1;*/
		if(k % 2 == 0){
			if (k > 0) {
				return (n * power(n, k - 1));
			} else if (k < 0) {
				return (1 / power(n, -k));
			} else {
				return 1;
			}

		} else {
			if (k > 0) {
				return (n * power(n, k - 1));
			} else if (k < 0) {
				return (1 / power(n, -k));
			} else {
				return 1;
			}
		}

	}

	public static double factorial(double number) {
		if (number < 2) {
			return 1;
		} 
		return number * factorial(number - 1);
	}

}