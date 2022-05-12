package baekJoon;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {

        String helloWorld = "";

        Scanner scanner  = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            char temp = scanner.next().charAt(0);
            helloWorld += temp;
        } // for

        System.out.println(helloWorld + "!!");

    }
}
