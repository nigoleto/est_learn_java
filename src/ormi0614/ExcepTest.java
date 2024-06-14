package ormi0614;

public class ExcepTest {

  public static void main(String[] args) {
    try {
      divide(10, 0);
    } catch (ArithmeticException | NullPointerException e) {
      System.out.println("값이 입력되지 않았거나 0으로 나눌 수 없습니다.");
    }

    System.out.println("정상적으로 종료되었습니다.");
  }

  private static int divide(int a, int b) {
    if (a / b == 0) {
      throw new ArithmeticException();
    } else {
      throw new NullPointerException();
    }
  }
}
