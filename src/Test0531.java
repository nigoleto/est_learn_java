import java.util.Arrays;

public class Test0531 {
  public static void main(String[] args) {

    String firstName = "SANG YOON";
    String lastName = "LEE";
    String phone = "Anycall Yuna's Haptic";
    String status = "sad";

    //    System.out.println("나는 " + lastName + " " + firstName + "입니다.");
    //    System.out.println(phone + " is " + status);

    // __________________________________________________________
    //    int a = 10;
    // int 라는 기본타입에는 아무 기능이 없다. 예약어일 뿐이다.

    // 클래스는  상태와 행동 두가지를 가지고 있다.

    // String에 Ctrl + B 를 누르면 String 이라는 Class에 접근할 수 있다.

    // String이라는 클래스를 보면 많은 status와 method를 가지고 있는 걸 볼 수 있다.

    //    System.out.println(firstName.length());
    //
    //    System.out.println(firstName == lastName);

    // ___________________________________________________________
    //    String a = "hello";
    //    String b = new String("hello");
    //
    //    System.out.println(a.equals(b));
    //    System.out.println(a == b);

    //    ____________________________________________________________
    //    String a = "Hello World";
    //
    //    //    System.out.println(a.indexOf("g"));
    //
    //    System.out.println(a.contains("World"));
    //
    //    String b = "ESTSOFT";
    //    System.out.println(b.contains("SOFT"));

    // ___________________________________________________________
    //    String findChar = "What is your hobby";
    //    System.out.print(
    //        findChar.charAt(13) + ""
    //            + findChar.charAt(14)
    //            + findChar.charAt(15)
    //            + findChar.charAt(16)
    //            + findChar.charAt(17));
    // ___________________________________________________________
    //    String a = "Hello World! Hello World! Hello World!";
    //    System.out.println(a.replace("World", "Java"));
    //
    // _______________________________________________________-__
    //    String a = "WEEEE ASKE ;ND";
    //    System.out.println(a.substring(0, 3) + a.substring(8, 10) + a.substring(12));

    //    _________________
    //    String a = "a:b:c:d";
    //
    //    String[] split = a.split(":");
    //
    //    System.out.println(a.split(":"));
    //    System.out.println(Arrays.toString(a.split(":")));
    //    System.out.println(split);
    //    System.out.println(split[0]);
    // ____________________________________
    //
    //    String result = "Hello";
    //
    //    // 위의 result를 이용해서 Hello World!를 만들고 싶다
    //    System.out.println(result + " World!");
    //    System.out.println(result);
    //
    //    // 저렇게 해도 되지만 result 자체의 값에 추가된 것은 아니다.
    //    String result2 = result.concat(" World!");
    //    System.out.println(result2);

    //    //    ____________________________________
    //    String name1 = "Tim";
    //    int age1 = 30;
    //
    //    String name2 = "Anna";
    //    int age2 = 45;
    //
    //    System.out.println(String.format("%s의 나이는 %s세 입니다", name1, age1));
    //    System.out.println(String.format("%s의 나이는 %s세 입니다", name2, age2));

    // ________________________
    //
    //    String result = "";
    //
    //    result += "Hello ";
    //    result += "Java";
    //    result += "World";
    //    System.out.println(result);
    //    // 이렇게 하면 메모리를 계속 먹는다. hello 와 java world가 메모리에 할당되는거같다
    //
    //    StringBuilder sb = new StringBuilder();
    //    sb.append("Hello ");
    //    sb.append("java");
    //    sb.append("World");
    //    System.out.println(sb);
    //
    //    // 간단한 문자열이면 그냥 String인데 뭔가 추가를 해야하거나 조작을 해야하면 무조건 StringBuilder || StringBuffer
    //
    //    StringBuffer sf = new StringBuffer();
    //    sf.append("Hello ");
    //    sf.append("java");
    //    sf.append("World");
    //    System.out.println(sf);

    // ________________________

    //    StringBuffer sb = new StringBuffer();
    //    sb.append("Hello");
    //    sb.insert(0,"World");
    //    sb.insert(0,"World");
    //    sb.insert(0,"World");
    //    sb.insert(0,"World");
    //    System.out.println(sb);

    // ________________________

    //
    //    int[] arr = new int[100];
    //    System.out.println(arr[0]); // 0을 반환
    //
    //    String[] arr2 = new String[1000];
    //    System.out.println(arr2[0]);

    // ________________________

    //      int positive =10;
    //      int negative = -10;
    //
    //    System.out.println("양의 부호 연산자 적용: " + (+positive));
    //    System.out.println("음의 부호 연산자 적용: " + (-positive));
    //    System.out.println("음의 부호 연산자로 부호 반전: "+ (+negative));
    //    System.out.println("음의 부호 연산자로 부호 반전: "+ (-negative));

    // ________________________

//    int x = 5;
//    int y = 5;
//
//    System.out.println("전위 증가 연산자: " + (++x));
//    System.out.println("후위 증가 연산자: " + (y++));
//
//    System.out.println("=================");
//    System.out.println("x는" + x);
//    System.out.println("y는" + y);

    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));

    System.out.println("=================");

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));

    System.out.println("=================");

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));



  }
}
