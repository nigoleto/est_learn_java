public class Test3 {

  public static void main(String[] args) {
//
//    int a = 0;
//    int v = a;
//
//    char c1 = 'A'; // 문자를 직접 저장
//    char c2 = 65; // 10진수로 저장
//    char c3 = '\u0041'; // 16진수로 저장
//
//    char c4 = '가'; // 문자를 직접 저장
//    char c5 = 44032; // 10진수로 저장
//    char c6 = '\uac00'; // 16진수로 저장
//
//    int unicode = c1; // 유니코드 얻기
//
//    System.out.println(c1);
//    System.out.println(c2);
//    System.out.println(c3);
//    System.out.println(c4);
//    System.out.println(c5);
//    System.out.println(c6);
//    System.out.println(unicode);

    short sVal =10;
    // sVal에 10을 더하는순간 sVal + 10 은 int형이 된다. (short)로 형을 변환시켜줘야함
    short result = (short)(sVal + 10);
    System.out.println(result);

    float myFloat = 9.75f;

    float anotherFloat = myFloat * 2;

    System.out.println("Original float value: " + myFloat);
    System.out.println("Calculated float value: " + anotherFloat);
  }
}
