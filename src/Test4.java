public class Test4 implements TestInterface {

  public static void main(String[] args) {
//
//    boolean isTrue = false;
//
//    if (!isTrue) {
//      System.out.println("이글루입니다.");
//    } else {
//      System.out.println("이건펄스입니다.");
//    };

//      public static void test() {
//        System.out.println("te");
//    }
    Test4 test4 = new Test4();
    test4.test();
  }


  @Override
  public void test() {
    System.out.println("test입니다.");
  }
}
