//import java.io.*;
import java.util.*;
import java.util.Map.Entry;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
import java.util.stream.*;

public class basicStatistics {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        /*int[] arrCount = new int[n]; //JAVA7
        int maxCount = 0;
        double mean = 0.0, median = 0.0;;
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            mean = mean + arr[i];
        }
        mean = mean/n;

        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++){
        		if(arr[i] == arr[j] && i != j){
        			arrCount[i]++;
        		}
        	if(maxCount < arrCount[i])
        		maxCount = i;
        	}
        }
        if(n%2 == 0) {
            median = arr[n/2] + arr[n/2-1]; 
            median = median/2;
        } else {
            median = arr[n/2];
        }*/
        
        for(int i = 0; i < n; i++) { //JAVA8
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        
        double mean = IntStream.of(arr).average().getAsDouble();
        double median = n % 2 == 0 ? (arr[n/2-1] + arr[n/2]) / 2 : arr[n/2];
        Map<Integer, Long> counts = IntStream.of(arr).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Long max = counts.values().stream().max(Comparator.naturalOrder()).get();
        int mode = counts.entrySet().stream()
                .filter(e -> e.getValue().equals(max))
                .min(Comparator.comparing(Entry::getKey)).get().getKey();
        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.println(mode); 
        
        //}
        
    }
}