package util;

import java.util.Scanner;

public class ScannerUtil {

	int cnt;

	// 1. 입력 시 메시지의 출력방법을 담당하는
	// printMessage(String)
	private static void printMessage(String message) {
		System.out.println(message);
		System.out.print("> ");
	}

	// 2. 정수 입력에 사용할
	public int nextInt(Scanner scanner, String message) {
		String temp = nextLine(scanner, message);
		while(validateNumber(temp)) {
			errorCount();
			System.out.println("잘못 입력하셨습니다.");
			temp = nextLine(scanner, message);
		}
		
		return Integer.parseInt(temp);
	}

	// 실수 입력에 사용할
	public double nextDouble(Scanner scanner, String message) {
		String temp = nextLine(scanner, message);

		while(validateNumber(temp)) {
			errorCount();
			System.out.println("잘못 입력하셨습니다.");
			temp = nextLine(scanner, message);
		}
		return Integer.parseInt(temp);
	}

	// 3. 범위의 정수 입력에 사용할
	// nextInt(Scanner, String, int, int)
	public int nextInt(Scanner scanner, String message, int min, int max) {
		int temp = nextInt(scanner, message);

		while (temp < min || temp > max) {
			errorCount();
			System.out.println("잘못 입력하셨습니다.");
			temp = nextInt(scanner, message);
		}
		return temp;
	}
	
	public double nextDouble(Scanner scanner, String message, double min, double max) {
		double temp = nextInt(scanner, message);

		while (temp < min || temp > max) {
			errorCount();
			System.out.println("잘못 입력하셨습니다.");
			temp = nextDouble(scanner, message);
		}
		return temp;
	}

	// 4. String 입력에 사용할
	public String nextLine(Scanner scanner, String message) {
		printMessage(message);
		String temp = scanner.nextLine();

		if (temp.isEmpty()) {
			temp = nextLine(scanner, message);
		}

		return temp;
	}


	private boolean validateNumber(String s) {
		String pattern = new String("^[0-9]*$");
		// 숫자로만 이루어져 있는지 체크

		if (s.matches(pattern)) {
			return false;
		}
		return true;
	}

	private void errorCount() {
		cnt++;
		if(cnt == 5) {
			System.out.println("errorCount 초과");
			System.exit(0);
		}
	}
}
