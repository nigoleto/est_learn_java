public class codeTest0610 {

  public static void main(String[] args) {
//    System.out.println(printAt("hello")); // "h@e@l@l@o"
//    System.out.println(printAt2("hellolll")); // "h@e@l@l@o"
//    System.out.println(printAt2("helloll")); // "h@e@l@l@o"
//    System.out.println(speedRacer(65, true));
//    System.out.println(speedRacer(62, false));
//
//    System.out.println(twoSumOne(1, 2, 3));
//    System.out.println(twoSumOne(3, 1, 2));
//    System.out.println(twoSumOne(4, 4, 4));

    System.out.println(isOrdered(1, 2, 4, false)); // true
    System.out.println(isOrdered(1, 2, 1, false)); // false
    System.out.println(isOrdered(1, 1, 2, true)); // true
    System.out.println(isOrdered(5, 1, 2, true)); // true
    System.out.println(isOrdered(2, 1, 4, false)); // false
  }

  static String printAt(String str) {

    //      int i = str.indexOf(1,"@");
    //      str.replace(String.valueOf(str.charAt(i)), "@" + str.charAt(i));
    //
    //      if (str.indexOf("@") != str.length() - 1) {
    //          return printAt(str);
    //    }
    //      return str;

    // 이런식으로 진행되어야한다.
    //      str.charAt(0) + "@"
    //
    //              printAt();
    // --------------------------2단계
    //      return str.charAt(0)+"@"+printAt();

    // str 이 hello -> ello -> llo -> lo -> o 로 짤려준다면 charAt(0)으로 계속 진행시킬수있다.

    //        return str.charAt(0) + "@" + printAt(str.substring(1));

    // 이제 중지시켜주어야한다.

    if (str.length() <= 1) {
      return str;
    }
    return str.charAt(0) + "@" + printAt(str.substring(1));

    // 이해가 안간다면 손으로 써보자
  }

  static String printAt2(String str) {
    StringBuilder result = new StringBuilder(str.charAt(0) + "");
    for (int i = 1; i < str.length(); i++) {
      result.append("@").append(str.charAt(i));
    }
    return result.toString();
  }

  /*  경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
  만약 당신의 속도가 60 이하라면 벌금은 없습니다.
  속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
  속도가 81 이상이라면 벌금은 200원입니다.
  단, 휴일인 경우 속도 한도가 5 더 높아집니다.

  속도가 60 이하라면 벌금은 0원입니다.
  속도가 61 이상이라면 벌금은 100원입니다.
  만약 휴일이라면 속도가 65라도 벌금은 0원입니다.*/

  static int speedRacer(int speed, boolean isHoliday) {
    if (isHoliday) {
      return speed > 85 ? 200 : speed > 65 ? 100 : 0;
    } else {
      return speed > 80 ? 200 : speed > 60 ? 100 : 0;
    }
  }

  public static boolean twoSumOne(int a, int b, int c) {
    return a + b == c || a + c == b || b + c == a;
  }

  public static boolean isOrdered(int a, int b, int c, boolean bool){
    return bool ? b < c : a < b && b < c;
  }
}
