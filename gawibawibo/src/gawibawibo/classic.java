package gawibawibo;

import java.util.Random;
import java.util.Scanner;

public class classic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요: ");
        int uChoice = s.nextInt();
        int cChoice = r.nextInt(3) + 1;
        String result = "";
        if (uChoice == cChoice) {
            result = "비겼습니다";
        } else if ((uChoice > cChoice) ||
                (uChoice == 1 && cChoice == 3)) {
            result = "이겼습니다";
        } else {
            result = "졌습니다";
        }

        System.out.println("사용자: " + getChoiceName(uChoice) + ", 컴퓨터: " + getChoiceName(cChoice));
        System.out.println(result);
    }
	private static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "가위";
            case 2:
                return "바위";
            case 3:
                return "보";
            default:
                return "잘못된 선택입니다.";
        }
    }
}

