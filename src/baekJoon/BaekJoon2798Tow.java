package baekJoon;

import java.util.Scanner;

public class BaekJoon2798Tow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 몇장의 카드를 합산제시할건지
        int M = scanner.nextInt(); // 카드의 합 최대
        int []arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        } // for
        int result = calculation(N, M, arr);
        System.out.println(result);
    } // main

    static int calculation(int n, int m, int[] arr) {
        int result = 0;
        
        for(int i = 0; i < n-2; i++) { // 3개의 카드를 고르기때문에 첫번째 for는 n-2 까지
            
            for(int j = i + 1; j < n-1; j++) { // 두번째 카드는 첫번째 카드를 제외하고 n-1 까지
                
                for(int k = j + 1; k < n; k++) { // 세번째 카드는 두번째까지의 카드를 제외하고 n까지
                    int temp = arr[i] + arr[j] + arr[k]; // 세 카드의 합산
                    
                    if(m == temp) { // 만약 m 과 세 카드의 합산이 같다면 return 
                        return temp;
                    } // if
                    
                    if(result < temp && m > temp) { // 세 카드의 합이 result 보다 작고 m 이 temp보다 크다면 result 를 temp로 초기화
                        result = temp;
                    } // if
                } // 3 for
            } // 2 for
        } // 1 for
        
        return result;
    } // calculation
} // class
