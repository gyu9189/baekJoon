package baekJoon;

import java.util.Scanner;

public class BaekJoon2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 배열 선언
		int[] arr; 
		// testCase 선언 후 scanner 로 입력받아 초기화
		// (i for 문을 몇번 돌릴지 정해주는 변수 입니다.)
		int testCase = scanner.nextInt(); 
		// testCase 만큼 for문을 돌립니다.
		for(int i = 0; i < testCase; i++) {
			int N = scanner.nextInt(); // 학생 수
			arr = new int[N]; // 배열의 크기를 학생 수 로 초기화
			double sum = 0; // 점수를 합산할 변수 선언 및 0 으로 초기화
			// 성적 입력 j for 
			for(int j = 0; j < N; j++) {
				int val = scanner.nextInt(); // 성적입력
				arr[j] = val;
				sum += val;
			}// j for
			double avg = sum / N; // 학생전체 평균 점수
			double cnt = 0; // 평균이 넘는 학생의 수 변
			// 평균이 넘는 학생 찾기 j for
			for(int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					cnt++;
				} // if 
			} // j for
			System.out.printf("%.3f%%\n", (cnt/N)*100);
		} // for
		scanner.close();
	}
	
	
	
}








