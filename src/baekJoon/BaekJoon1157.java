package baekJoon;

import java.util.Scanner;

public class BaekJoon1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        while(S.length() > 1000000) {
            S = scanner.nextLine();
        } // while
        int []arr = new int[26];

        for(int i = 0; i < S.length(); i ++) {
            char temp = S.charAt(i);
        } // for



    }
}
