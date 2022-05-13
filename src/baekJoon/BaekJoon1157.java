package baekJoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        while(S.length() > 1000000) {
            System.out.println("??");
            S = scanner.next();
        } // while

        int []arr = new int[26];
        int max = 0;
        int idx = 0;
        for(int i = 0; i < S.length(); i ++) {
            char temp = S.charAt(i);
            arr[temp - 'a'] += 1;
        } // for

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            } // if
        } // for

       for(int i = 0; i < arr.length; i ++) {
           for(int j = 0; j < arr.length; j ++) {
                if(max != arr[j]) {
                    char temp2 = (char) (idx + 'a');
                    System.out.println(temp2);
                    break;
                } // if
               if(max == arr[i]) {
                   System.out.println("?");
                   break;
               } // if
           } // j for
       } // for














    }
}
