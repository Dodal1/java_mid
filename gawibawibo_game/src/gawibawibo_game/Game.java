package gawibawibo_game;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cNumber = random.nextInt(3) + 1;
        int uNumber = getUserNumber(scanner);
        int cChoice = random.nextInt(3) + 1;
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요: ");
        int uChoice = scanner.nextInt();
        String result = getWinner(uNumber, cNumber, uChoice, cChoice);
        System.out.println("사용자 숫자: " + uNumber + ", 컴퓨터 숫자: " + cNumber);
        System.out.println("사용자 선택: " + getChoiceName(uChoice) + ", 컴퓨터 선택: " +getChoiceName(cChoice));
        System.out.println(result);
    }

    private static int getUserNumber(Scanner scanner) {
        while (true) {
            System.out.print("1부터 3까지의 숫자를 입력하세요: ");
            int number = scanner.nextInt();
            if (1 <= number && number <= 3) {
                return number;
            } else {
                System.out.println("잘못된 숫자입니다 다시 입력하세요");
            }
        }
    }

    private static String getWinner(int uNumber, int cNumber, int uChoice, int cChoice) {
        String result = getChoiceName(uChoice) + " vs " + getChoiceName(cChoice);

        if (uChoice == cChoice) {
            result += ", 비겼습니다";
            return result;
        }
        if (uNumber > cNumber) {
            result += ", 숫자 크기로 승리했습니다";
            return result;
        } else if (uNumber < cNumber) {
            result += ", 숫자 크기로 패배했습니다";
            return result;
        } else {
            result += ", 숫자 크기는 비겼습니다";
        }
        if ((uChoice == 1 && cChoice == 3) ||
            (uChoice == 2 && cChoice == 1) ||
            (uChoice == 3 && cChoice == 2)) {
            result += ", 승리했습니다";
            return result;
        } else {
            result += ", 패배했습니다";
            return result;
        }
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
                return "잘못된 선택입니다";
        }
    }
}
