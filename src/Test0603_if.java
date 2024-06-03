import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test0603_if {

  public static void main(String[] args) {
    //    int number = 10;
    //
    //    if (number > 10) {
    //      System.out.println("number는 10보다 큽니다.");
    //    } else if (number < 10) {
    //      System.out.println("number는 10보다 작습니다.");
    //      if (number > 5) {
    //        System.out.println("number는 5보다 큽니다.");
    //      }
    //    } else {
    //      System.out.println("number는 10입니다.");
    //    }
    //
    //    ________________________________________
    //
    //    int a;
    //    int b;
    //
    //    a = 10;
    //    b = 15;
    //
    //    //    if (a > b) {
    //    //      System.out.println("a is greater than b");
    //    //    } else if (a < b) {
    //    //      System.out.println("a is less than b");
    //    //    } else {
    //    //      System.out.println("a and b are equal");
    //    //    }
    //
    //    System.out.println(
    //            (a == b) ? "a and b are equal" : ((a > b) ? "a is greater than b" : "a is less
    // than b"));

    //    ________________________________________

    //    int x = 10;
    //
    //    System.out.println(x > 0 ? "양수" : x == 0 ? 0 : "음수");

    //    ________________________________________

    //    int score = 55;
    //
    //    if(score >= 90) {
    //      System.out.println("A");
    //    }else if(score >= 80){
    //      System.out.println("B");
    //    }else if(score >= 70){
    //      System.out.println("C");
    //    }else if(score >= 60){
    //      System.out.println("D");
    //    }else{
    //      System.out.println("F");
    //    }

    //    ________________________________________

    //    int year = 4000;
    //
    //    if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
    //      System.out.println("윤년");
    //    }

    //    ________________________________________

    //    int a = 50;
    //    int b = 60;
    //    int c = 60;
    //
    //    System.out.println(a > b && a > c ? a : b > c ? b : c);

    //    ________________________________________

    //    int passScore = 60;
    //    int myScore = 75;
    //
    //    System.out.println(myScore >= passScore ? "합격" : "불합격");

    //    ________________________________________

    //    int a = 10;
    //    int b = 5;
    //
    //    boolean result1 = (a > 5) && (b < 10);
    //    boolean result2 = (a > 5) || (b > 10);
    //    boolean result3 = !(a > 5);

    //    ________________________________________

    //    int three = 3;
    //    int five = 5;
    //    int two = 2;
    //
    //    boolean result = (five > three) || (five < two) && (five < three);
    //
    //    boolean result2 = (five < three) || (five > two) && (five < three);
    //
    //
    //    System.out.println(result2);

    //    ________________________________________

    //    boolean x = false;
    //    boolean y = true;
    //    boolean z = true;

    //    System.out.println(
    //        x == true && y == false
    //            ? "조건1충족"
    //            : y == true && z == true || x == false && z == false
    //                ? "조건2충족"
    //                : x == true || y == true || z == true ? "적어도 하나는 참" : "모두 거짓");
    //

    //    if (x && !y) {
    //      System.out.println("조건 1 충족");
    //    }
    //    if (y && z || !x && !z) {
    //      System.out.println("조건 2 충족");
    //    }
    //    if (x || y || z) {
    //      System.out.println("적어도 하나는 참");
    //    }
    //    if (!x && !y && !z) {
    //      System.out.println("모두 거짓");
    //    }
  }
}
