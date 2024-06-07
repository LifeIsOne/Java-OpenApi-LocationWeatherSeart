package weather;

import weather._core.dao.WeatherDAO;
import weather._core.data.WeatherVO;
import weather._core.db.DBConnection;
import weather._core.util.MyHttp;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 1. init 객체 최고화
        Scanner sc = new Scanner(System.in);
        WeatherDAO dao = new WeatherDAO(DBConnection.getInstance());

        // 2. 프로세스 시작
        System.out.print("시•군•구 을(를) 입력하세요.");
        System.out.print("[부산진구, 사상구, 동래구] : ");

        String gu = sc.nextLine();
        List<String> dongs = dao.동찾기(gu);

        System.out.println("읍•면•동 을(를) 입력하세요.");
        dongs.forEach(s -> System.out.print("["+ s + "] "));
        System.out.println();
        System.out.print(" : ");

        String dong = sc.nextLine();
        Map<String, String> los = dao.위경도찾기(dong, gu);

        WeatherVO vo = new WeatherVO("20240607", "1600", los.get("nx"), los.get("ny"));
        try {
            String responseBody = MyHttp.get(
                    vo.uri,
                    vo.serviceKey,
                    vo.baseDate,
                    vo.baseTime,
                    vo.nx,
                    vo.ny
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
