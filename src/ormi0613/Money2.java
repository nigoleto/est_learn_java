package ormi0613;

public class Money2 extends Money1 {

  public void invest() {
    if (money > 1000) {
      money -= 1000;
      System.out.println(money);
    } else {
      System.out.println("투자할 돈이 없습니다");
    }
  }
}
