package baekJoon;

import java.util.Scanner;

public class BaekJoon {
	

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = new String[scanner.nextInt()];
		scanner.nextLine();
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scanner.nextLine();
		} // for 
		
		scanner.close();
		
		for(int i = 0; i < arr.length; i ++) {
			int sum = 0;
			int cnt = 0;
			
			for(int j = 0; j < arr[i].length(); j ++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				} // else 
				sum += cnt;
			} // j for
			
			System.out.println(sum);
		} // for
		
	} 
	
}
