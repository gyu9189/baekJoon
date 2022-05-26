package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1157two {
    public static void main(String[] args) throws IOException { // IOException //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String c = bufferedReader.readLine();

        for(int i = 0; i < c.length(); i++) {
            if('A' <= c.charAt(i) && c.charAt(i) <= 'Z') {
                arr[c.charAt(i) - 'A']++;
            } else {
                arr[c.charAt(i) - 'a']++;
            } // else
        } // for

        int max = -1;
        char ch = '?';

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A'); // 대문자 출력을 위해 + 65
            } else if(arr[i] == max) {
                ch = '?';
            } // else if
        } // for

        System.out.println(ch);
    }
}
