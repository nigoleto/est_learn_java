package ormi0612;

import ormi0612.house.HouseKim;

public class StaticFinal {

    static final String STR = "잠은 죽어서 자는 것이다.";
    static final int RADIUS = 6400;
    static final double PIE = 3.141592;
    static final boolean DIE = true;

    protected void testMethod() {
        System.out.println("test");
    }

    HouseKim houseKim = new HouseKim();

//    static final int b; -> 이렇게 그냥 선언만 할 수 없다. 상수기 때문에 초기화까지 같이해줘야함.

}
