package baekJoon;

import java.util.Scanner;

public class BaekJoon11720 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner 객체생성
		
		int N = scanner.nextInt(); // 숫자의 자릿수 정해줄변수
		
		String str = scanner.next(); 
		
		int sum = 0;
		
		for(int i = 0; i < N; i ++) {

			sum += str.charAt(i)-'0'; 
		} // for 
		
		System.out.println(sum);
	}
}
