package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int [][]arr = new int[N][2];
        String[] str;
        for(int i = 0; i < N; i++) {
            str = bufferedReader.readLine().split(" "); // 문자열 분리
            arr[i][0] = Integer.parseInt(str[0]); // [i][0] 몸무게
            arr[i][1] = Integer.parseInt(str[1]); // [i][1] 키
        } // for

        for(int i = 0; i < N; i ++) {
            int rank = 1;

            for(int j = 0; j < N; j++) {
                if(i == j) continue; // 같은사람은 비교할 필요 없음

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                } // if
            } // 2 for
            System.out.print(rank + " ");
        } // 1 for
    }
}
