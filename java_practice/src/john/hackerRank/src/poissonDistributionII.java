
public class poissonDistributionII {

	public static void main(String[] args) {
		
		final double xMean = 0.88;
		final double yMean = 1.55;

		System.out.printf("%.3f", 160 + 40 * (xMean + power(xMean,2)));
		System.out.println();
		System.out.printf("%.3f", 128 + 40 * (yMean + power(yMean,2)));

	}

	public static double power(double n, double k) {
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

}