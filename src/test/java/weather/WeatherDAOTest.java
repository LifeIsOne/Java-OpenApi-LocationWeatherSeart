package weather;

import org.junit.jupiter.api.Test;
import weather._core.dao.WeatherDAO;
import weather._core.db.DBConnection;

import java.util.List;
import java.util.Map;

public class WeatherDAOTest {

    @Test
    public void 동찾기_test(){
        // given
        String gu = "부산진구";

        // when
        WeatherDAO dao = new WeatherDAO(DBConnection.getInstance());
        List<String> dongs = dao.동찾기(gu);

        dongs.forEach(System.out::println);

    }
    @Test
    public void 위경도찾기_test(){
        // given
        String gu = "부산진구";
        String dong = "부전제1동";

        // when
        WeatherDAO dao = new WeatherDAO(DBConnection.getInstance());
        Map<String,String> los = dao.위경도찾기(dong, gu);

        // 기대값 98 75
        System.out.println("nx : " + los.get("nx"));
        System.out.println("ny : " + los.get("ny"));

    }
}
