package baekJoon;

import java.util.Scanner;

public class BaekJoon2675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		int N = scanner.nextInt(); // N 이라는 변수 생성 및 입력받아 초기화 (문자열을 몇번 반복받을거냐 ? 그런거임)
		
		for(int i = 0; i < N; i ++) { // i for문 N번만큼 반복
			int R = scanner.nextInt(); // 문자열을 한글자씩 잘라 *R 해주는거임
			
			String S = scanner.next(); // 문자열 입력받음
			
			while(S.length() < 0 || S.length() > 20) { // while문을 통해 입력받은 문자열이 만약 0보다 작거나 20보다 클시 다시 입력받음 계 ~~ 속 
				S = scanner.next();
			}// while
			
			String P = ""; // 문자열을 잘라 붙일 P 라는 변수
			
			for(int j = 0; j < S.length(); j ++) { // j for문 입력받은 문자열의 len 만큼 돌림
				char temp = S.charAt(j); // 임시변수 temp 에 입력받은 S(문자열)의 j 번째를 저장
				for(int k = 0; k < R; k++) { // k for 문 11line 에 입력받은 R 만큼 반복함
					P += temp; // P 변수에 임시변수 temp 를 += 
				} // j for 
			} // for 
			
			System.out.println(P); // 출력!!!! 
		} // for 
		
	}
}
