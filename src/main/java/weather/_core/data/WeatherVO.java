package weather._core.data;

public class WeatherVO {
    public String uri = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst";
    public String serviceKey = "k0FAvS%2BToo%2F7%2F0tt9A7Fx7FKMgwwHAE468tV5sjgnqo4sgNMRcGFxrCyzxor5ixzNOIpLMTanJDUQvOPdN95JQ%3D%3D";
    public String baseDate;
    public String baseTime;
    public String nx;
    public String ny;

    public WeatherVO(String baseDate, String baseTime, String nx, String ny) {
        this.baseDate = baseDate;
        this.baseTime = baseTime;
        this.nx = nx;
        this.ny = ny;
    }
}