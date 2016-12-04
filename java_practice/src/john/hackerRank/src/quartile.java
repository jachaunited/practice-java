import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class quartile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] arr = new int[n];
    	int Q1 = 0, Q2 = 0, Q3 = 0, count = 0;
    	for(int i = 0; i < n; i++) {
    		arr[i] = in.nextInt();
    	}
    	Arrays.sort(arr);
    	if(n % 2 != 0) {
    		Q2 = arr[n/2];
    		for(int i = 0; i < n/2; i++) {
        		count++;
        		Q1 = (n/2) % 2 != 0 ? arr[(n/2 - 1)/2]:
        			(arr[(n/2 - 1)/2] + arr[(n/2 - 1)/2 + 1])/2;
        	}
        	for(int i = 0; i < count; i++) {
        		Q3 = count % 2 != 0 ? arr[n/2 + count/2]:
        			(arr[n/2 + count/2] + arr[(n/2 + count/2) + 1])/2;
        	}
    	}
    	else {
    		Q2 = (arr[n/2] + arr[n/2 - 1])/2;
    		for(int i = 0; i < n/2; i++) {
        		count++;
        		Q1 = (n/2) % 2 != 0 ? arr[(n/2 - 1)/2]:
        			(arr[(n/2 - 1)/2] + arr[(n/2 - 1)/2 + 1])/2;
        	}
        	for(int i = 0; i < count; i++) {
        		Q3 = count % 2 != 0 ? arr[n/2 + count/2]:
        			(arr[n/2 + count/2] + arr[(n/2 + count/2) - 1])/2;
        	}
    	}
 
    	System.out.println(Q1 + "\n" + Q2 + "\n" + Q3);
    }
}