package java1class;

// 가위 바위 보 게임 만들기
// 1. 프로그램이 시작하면 다음 메세지를 출력
// 	  가위, 바위, 보 중 하나를 입력하세요.
// 2. 위 값이 아닐시 틀린값
// 3. 만약 5번 이상 틀리면 프로그램을 종료합니다, 라는 메세지 출력 후 종료.
// 4. 정확한 값이 입력이 되면 컴퓨터와 게임을 시작하고 결과를 출력 시키세요.
//    나 : 가위  컴퓨터 : 보     win
// 5. 위 출력문 후 계속 할건지 물어보세요.
//    만약 N 을 입력하면 게임수, 승, 패, 무, 승률(%) 을 출력
//    만약 Y 를 입력하면 게임은 반복 됩니다.
//    아래는 위 게임을 구성하기위한 필수 API 입니다.

import util.ScannerUtil;
import java.util.Scanner;

public class Gawibawiibo {

    public static void main(String[] args) {
        ScannerUtil scannerUtil = new ScannerUtil();
        Scanner scanner = new Scanner(System.in);

        System.out.println("======[GAME START]======");

        int userChoice, randomNum;
        int gameCount = 1;
        int win = 0, draw = 0, lose = 0;
        double odds;
        String user = "", computer = "";

        while(true) {
            randomNum = (int)(Math.random()*3)+1;

            String message = "가위, 바위 보 중 번호로 선택하세요. \n 1. 가위 2. 바위 3. 보";
            userChoice = scannerUtil.nextInt(scanner, message, 1, 3);

            if(userChoice == 1) {
                user = "가위";
            } else if(userChoice == 2) {
                user = "바위";
            } else if(userChoice == 3) {
                user = "보";
            }

            if(randomNum == 1) {
                computer = "가위";
            } else if(randomNum == 2) {
                computer = "바위";
            } else if(randomNum == 3) {
                computer = "보";
            } else {
                System.out.println("system error");
                continue;
            } // else

            String result = battle(userChoice, randomNum);

            if(result.equals("win")) {
                win++;
            } else if(result.equals("draw")) {
                draw++;
            } else if(result.equals("lose")) {
                lose++;
            } else {
                System.out.println("error");
            } // else

            System.out.println("==== [결과 : "+ result + "] ====");
            System.out.println("user : " + user + " computer : " + computer);


            message = "게임을 계속 하시겠습니까 ? [ Y / N ]";
            String yseNo = scannerUtil.nextLine(scanner, message);

            if(yseNo.equalsIgnoreCase("Y")) {
                gameCount++;
            } else {
                odds = (double)(win) / (double)(gameCount) * 100;
                System.out.println("==== 최종결과 ====");
                System.out.println("게임수 : " + gameCount);
                System.out.printf("승 : %d  패 : %d  무 : %d  승률 : %.2f", win, lose, draw, odds);
                break;
            } // else
        } // while
        scanner.close();
    } // main


    static String battle(int user, int computer) {
        String result = null;
        if(user > 0 && user <= 3) {
            if((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
                result = "win";
            } else if(user == computer) {
                result = "draw";
            } else {
                result = "lose";
            } // else
        } // if
        return result;
    } // battle
}
