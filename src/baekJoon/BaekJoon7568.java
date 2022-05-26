package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine()); // 몇명인지

        int [][]arr = new int[N][2]; // 2차원배열의 첫번째 배열은 인원수대로 초기화 / 두번째배열은 키, 몸무게를 담을것이므로 2로 초기화
        
        String[] str; // bufferReader로 입력받을 키와 몸무게를 담을 str 배열 선언

        for(int i = 0; i < N; i++) {
            str = bufferedReader.readLine().split(" "); // 문자열 분리
            arr[i][0] = Integer.parseInt(str[0]); // [i][0] 몸무게
            arr[i][1] = Integer.parseInt(str[1]); // [i][1] 키
        } // for

        for(int i = 0; i < N; i ++) {
            int rank = 1; // 기본적인 순위는 1로 (for문이 돌때마다 초기화 됨)

            for(int j = 0; j < N; j++) {
                if(i == j) continue; // 같은사람은 비교할 필요 없음

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { // 키와 몸무게 둘다 i보다 클시 rank++
                    rank++;
                } // if
            } // 2 for
            System.out.print(rank + " "); // 출력 !
        } // 1 for
    }
}
