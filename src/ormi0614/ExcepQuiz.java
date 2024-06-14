package ormi0614;

import java.util.Scanner;

public class ExcepQuiz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수배열의 크기를 입력하세요: ");
    int size = sc.nextInt();

    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.print(i +"번째 배열요소를 입력하세요: ");
      arr[i] = sc.nextInt();
    }

    try {
      System.out.println("출력하실 배열요소의 인덱스를 입력하세요");
      int indexNum = sc.nextInt();
      System.out.println("입력하신 인덱스의 배열요소값은 " +arr[indexNum] + "입니다.");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("입력하신 인덱스가 배열의 크기를 벗어납니다.");
    } finally {
      System.out.println("프로그램을 종료합니다.");
      sc.close();
    }

    // -------------------quiz 1-----------------
    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("첫번째 정수를 입력하세요");
    //    int a = sc.nextInt();
    //    System.out.println("두번째 정수를 입력하세요");
    //    int b = sc.nextInt();
    //
    //    try{
    //      System.out.println(a / b);
    //    }catch (ArithmeticException e){
    //      System.out.println("두번째 정수가 0입니다.");
    //    }finally{
    //      sc.close();
    //    }

  }
}
