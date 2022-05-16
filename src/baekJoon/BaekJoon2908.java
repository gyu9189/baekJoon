package baekJoon;

import java.util.Scanner;

public class BaekJoon2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                   
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();

        num = Integer.parseInt(new StringBuilder().append(num).reverse().toString());
        num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());

        System.out.println(num > num2 ? num : num2);
    } // main
}
