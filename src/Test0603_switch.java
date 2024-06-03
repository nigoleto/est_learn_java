public class Test0603_switch {

  public static void main(String[] args) {
    //
    //    String day = "목요일";
    //
    //    switch (day) {
    //      case "월요일":
    //        System.out.println("책읽기");
    //        break;
    //      case "화요일":
    //        System.out.println("책 안읽기");
    //        break;
    //      case "수요일":
    //        System.out.println("밥먹기");
    //        break;
    //      case "목요일":
    //        System.out.println("놀기");
    //        break;
    //      case "금요일":
    //        System.out.println("재밌게 놀기");
    //        break;
    //      case "토요일":
    //        System.out.println("쉬기");
    //        break;
    //      default:
    //        System.out.println("알 수 없는 요일에는 잠자기");
    //    }

    //    ______________________________________

    //    char grade = 'A';
    //
    //    switch (grade) {
    //      case 'A':
    //        System.out.println("Excellent");
    //        break;
    //      case 'B':
    //        System.out.println("Good");
    //        break;
    //      case 'C':
    //        System.out.println("Average");
    //        break;
    //      case 'D':
    //        System.out.println("Below Average");
    //        break;
    //      case 'F':
    //        System.out.println("Fail");
    //        break;
    //    }

    //    ______________________________________

    //    char operator = '+';
    //    int num1 = 1;
    //    int num2 = 2;
    //
    //    switch (operator) {
    //      case '+':
    //        System.out.println(num1 + num2);
    //        break;
    //      case '-':
    //        System.out.println(num1 - num2);
    //        break;
    //      case '*':
    //        System.out.println(num1 * num2);
    //        break;
    //      case '/':
    //        System.out.println(num1 / num2);
    //        break;
    //    }

    //    ______________________________________

//    String color = "red";
//
//    switch (color) {
//      case "red":
//        System.out.println("Apple");
//        break;
//      case "green":
//        System.out.println("Grass");
//        break;
//      case "blue":
//        System.out.println("Sky");
//        break;
//    }

    //    ______________________________________

    int score = 80;

    switch (score / 10) {
      case 10,9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
    }

    //    ______________________________________

    String language = "Java";

    switch(language){
      case "Java":
        System.out.println("Java입니다.");
        break;
      case "Python":
        System.out.println("Python입니다.");
        break;
      case "C++":
        System.out.println("C++입니다.");
        break;
      case "JavaScript":
        System.out.println("JavaScript입니다.");
        break;
    }
  }
}
