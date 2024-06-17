package ormi0617;

public class KiaCar implements Car{
    @Override
    public String showEngine() {
    return "엔진엔진입니다.";
    }

    @Override
    public double amountNavi() {
        return 50000000;
    }

    @Override
    public String getTire() {
    return "타이어타이어입니다.";
    }
}
