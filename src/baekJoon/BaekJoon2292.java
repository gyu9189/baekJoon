package baekJoon;

import java.util.Scanner;

public class BaekJoon2292 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 1; // 겹 수(최소 루트)
        int range = 2;	// 범위 (최솟값 기준)

        if (N == 1) {
            System.out.print(1);
        } // if

        else {
            while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화
                count++;	// count 1 증가
            } // while

            System.out.print(count);
        }
    }
}
