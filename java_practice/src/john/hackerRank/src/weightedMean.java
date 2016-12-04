import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class weightedMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrN = new int[n];
        int[] arrD = new int[n];
        double dividend = 0.0;
        double divisor = 0;
        for(int i = 0; i < n; i++) {
            arrN[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arrD[i] = in.nextInt();
            dividend += arrN[i] * arrD[i];
            divisor += arrD[i];
        }
        System.out.printf("%.1f", dividend/divisor);
    }
}