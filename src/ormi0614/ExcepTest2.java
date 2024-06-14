package ormi0614;

public class ExcepTest2 {

  public static void main(String[] args) {

    try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("예외여부와 상관없이 항상 실행되는 문장");
    }
  }
}
