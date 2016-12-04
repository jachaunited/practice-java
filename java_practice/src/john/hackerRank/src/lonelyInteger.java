//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class lonelyInteger {
     private static int lonelyInt(int[] a) {
         
         int[] aCount = new int[a.length];
         int index = 0;
         
         /*for (int x = 0; x < a.length; x++){
             aCount[x] = 1;
         }*/
                  
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    aCount[i]++;
                    
                }
               
            }
            System.out.println(i +" " + aCount[i]);
            System.out.println(a[i]);
        }
         
         for (int y = 0; y < a.length; y++){
             if(aCount[y] == 1){
                 index = y;
             }
         }
         
         return a[index];
         
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInt(a));
        in.close();
    }

}