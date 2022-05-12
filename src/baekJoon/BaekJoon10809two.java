package baekJoon;

import java.util.Scanner;

public class BaekJoon10809two {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[26]; // 알파벳 수대로 배열크기 초기화

		long start = System.currentTimeMillis();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1; // 기본적으로 -1로 전부 초기화
		} // for 
		
		String S = scanner.nextLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i); // 입력받은 S 문자열의 i번째를 ch에 
			
			if(arr[ch - 'a'] == -1) { 
				arr[ch - 'a'] = i;
			} // if 
		} // for
		
		for(int val : arr) {
			System.out.print(val + " ");
		} // for

		long end = System.currentTimeMillis();
		long time = (start - end);

		System.out.println("걸린시간 : " + time);
	}
}
