import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Scanner0605 {

  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("정수를 입력해주세요");
    //    int a = sc.nextInt();
    //
    //    System.out.println("문자를 입력해주세요");
    //    String str = sc.next();
    //
    //    sc.nextLine();
    //    System.out.println("문자2를 한번더");
    //
    //    String nextLine = sc.nextLine();
    //    System.out.println("제가 입력한 값은 " + a + str + " 입니다.");
    //    System.out.println("nextLine : " + nextLine);
    //
    //    sc.close();

    //    -------------------- Q1)

    //    Scanner scanner = new Scanner(System.in);
    //
    //    System.out.println("1에서 4사이의 숫자를 입력하세요");
    //    int number = scanner.nextInt();
    //
    //    switch (number) {
    //      case 1:
    //        System.out.println("봄");
    //        break;
    //      case 2:
    //        System.out.println("여름");
    //        break;
    //      case 3:
    //        System.out.println("가을");
    //        break;
    //      case 4:
    //        System.out.println("겨울");
    //        break;
    //      default:
    //        System.out.println("잘못된 입력입니다!");
    //    }

    //    -------------------- Q2)

    //        Scanner scanner = new Scanner(System.in);
    //
    //        Random random = new Random();
    //        int targetNumber = random.nextInt(100) + 1;
    //
    //
    //        while(true){
    //          System.out.println("랜덤생성된 숫자를 맞춰보세요.");
    //          int guessNum = scanner.nextInt();
    //
    //          if (guessNum > targetNumber) {
    //            System.out.println("입력한 숫자가 랜덤숫자보다 큽니다.");
    //          } else if (guessNum < targetNumber) {
    //            System.out.println("입력한 숫자가 랜덤숫자보다 작습니다.");
    //          } else {
    //            System.out.printf("정답입니다!! 랜덤숫자는 %d입니다!",targetNumber);
    //            break;
    //          }
    //        }
    //
    //        scanner.close();

    //    -------------------- Q3)

//        Scanner sc = new Scanner(System.in);
//        int getNumber;
//
//        while (true) {
//          System.out.println("원하는 기능을 선택하세요: ");
//          System.out.println(" 1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 0. 종료 ");
//          getNumber = sc.nextInt();
//          if (getNumber == 0) {
//            System.out.println("계산기를 종료합니다.");
//            break;
//          }else if(getNumber > 4 || getNumber < 0){
//            System.out.println("잘못된 값을 입력하셨습니다.");
//          }
//          else{
//            System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
//            int Num1 = sc.nextInt();
//            System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
//            int Num2 = sc.nextInt();
//
//            switch (getNumber) {
//              case 1:
//                System.out.println(Num1 + " + " + Num2 + " = " + (Num1 + Num2));
//                break;
//              case 2:
//                System.out.println(Num1 + " - " + Num2 + " = " + (Num1 - Num2));
//                break;
//              case 3:
//                System.out.println(Num1 + " x " + Num2 + " = " + (Num1 * Num2));
//                break;
//              case 4:
//                System.out.println(Num1 + " / " + Num2 + " = " + (Num1 / Num2));
//            }
//          }
//        }

    //    -------------------- Q4)

    //    Random random = new Random();
    //
    //    int[] lotto = new int[6];
    //
    //    lotto[0] = random.nextInt(45) + 1;
    //    for(int i = 1; i < 6 ; i++) {
    //       lotto[i] = random.nextInt(45) + 1;
    //      if (lotto[i - 1] == lotto[i]) i--;
    //    }
    //
    //    for(int ele: lotto){
    //      System.out.print("[" + ele + "] ");
    //    }

    // ____________________________

    //    Random random = new Random();
    //
    //    ArrayList<Integer> list = new ArrayList<Integer>();
    //
    //    while(list.size()!=6){
    //      int number = random.nextInt(45) + 1;
    //
    //      if(!list.contains(number)){
    //        list.add(number);
    //      }
    //    }
    //
    //    for(int data: list){
    //      System.out.print("[" + data + "] ");
    //    }

    //    -------------------- Q5)

//    Scanner sc = new Scanner(System.in);
//
//    while (true) {
//
//      System.out.println("영화 제목을 입력하세요");
//      String titleMovie = sc.next();
//      System.out.println("관람할 인원수를 숫자로만 입력하세요");
//      int howManyPeople = sc.nextInt();
//      System.out.println("예매자 성함을 입력하세요.");
//      String name = sc.next();
//      System.out.println("예매자의 전화번호를 입력하세요");
//      String phoneNumber = sc.next();
//
//      System.out.println("===== 영화 티켓 예매 정보 =====");
//      System.out.println("영화 제목: [" + titleMovie + "]");
//      System.out.println("관람 인원: [" + howManyPeople + "]명");
//      System.out.println("예매자 이름: [" + name + "]");
//      System.out.println("예매자 전화번호: [" + phoneNumber + "]");
//      System.out.println("============================");
//      System.out.println("예매 정보가 정확하다면 YES 를, 아니라면 NO 를 입력해주세요.");
//      String answer = sc.next();
//
//      if (answer.toUpperCase().equals("YES")) {
//        System.out.println("======== 총 결제 금액 ========");
//        System.out.println("총 결제 금액: [" + howManyPeople * 10000 + "]원 입니다.");
//        break;
//      }
//    }
  }
}
