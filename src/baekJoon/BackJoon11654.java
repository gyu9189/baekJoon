package baekJoon;

import java.util.Scanner;
/*
문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.
*/
public class BackJoon11654 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		
		int N = scanner.next().charAt(0); // 입력받는 문자열의 index 0 번째를 int 값으로 변환시킴
		
		System.out.println(N);
	}
	
}












