package java1class;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String helloWorld = "";

        for(int i = 0; i < 10; i++) {
            char temp = scanner.next().charAt(0);
            helloWorld += temp;
        } // for

        System.out.println(helloWorld + "!!");

    }
}
