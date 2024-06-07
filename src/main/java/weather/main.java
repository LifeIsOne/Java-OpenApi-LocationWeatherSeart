package weather;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("시•군•구 을(를) 입력하세요.");
        System.out.print("[부산진구, 사상구, 동래구] : ");

        Scanner sc = new Scanner(System.in);
        String gu = sc.nextLine();
        System.out.println("선택한 구 : " + gu);

        System.out.print("읍•면•동 을(를) 입력하세요.");

    }
}
