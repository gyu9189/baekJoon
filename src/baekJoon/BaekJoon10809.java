package baekJoon;

import java.util.Scanner;

public class BaekJoon10809 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		scanner.close();
		String str = "abcdefghijklnmopqrstuvwxyz";

		long start = System.currentTimeMillis(); // 초세기 start !!
		for(int i = 0; i < str.length(); i++) {
			int temp = 0;
			for(int j = 0; j < S.length(); j++) {
				
				if(str.charAt(i) == S.charAt(j)) {
					temp = j;
					break;
				} else {
					temp = -1;
				} // else c
				
			} // j for
			System.out.print(temp + " ");
		} // for

		long end = System.currentTimeMillis();
		long time = (start - end);
		System.out.println("걸린시간2 : " + time);
	}
}









