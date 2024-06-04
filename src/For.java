import java.util.Arrays;
import java.util.stream.IntStream;

public class For {
  public static void main(String[] args) {

    //    int sum = 0;
    //
    //    for (int i = 1; i <= 100; i++) {
    //      if (i % 2 == 0) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println(sum);
    //
    //    int sum2 = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).sum();
    //
    //    System.out.println(sum2);

    //    -----------------------

    //    int n = 20;
    //    int sum = 0;
    //    for(int i = 1; i <= n; i++){
    //      if(i % 3 == 0 && i % 5 ==0){
    //        sum += i;
    //      }
    //    }
    //    System.out.println(sum);

    //    -----------------------

    //    int[] arr = new int[10];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //
    //    for (int i = 2; i < 10; i++) {
    //      arr[i] = arr[i - 2] + arr[i - 1];
    //    }
    //
    //    for (int numArr : arr){
    //      System.out.println(numArr);
    //    }

    //    -----------------------

    //    int a = 1;
    //    int b = 1;

    //    -----------------------

    //    for(int i = 0; i >= -100; i-=2){
    //      System.out.println(i);
    //    };

    //    -----------------------

    //    IntStream.rangeClosed(-100, 0).filter(n -> n % 2 == 0)
    //            .forEach(n -> System.out.println(n));

    //    -----------------------

    //    int[] arr = new int[30];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //
    //    for(int i = 2; i <100; i++){
    //      arr[i] = arr[i-2] + arr[i-1];
    //    }
    //
    ////    Arrays.parallelSetAll(arr, i->(i<2)?1:arr[i-1]+ arr[i-2]);///????????????
    //
    //    for (int arr1 : arr) {
    //      System.out.println(arr1);
    //  }
    //    -----------------------

    //  for(int i = 0; i < 100 ; i++) {
    //    for(int j = 0; j < 100; j++) {
    //      for(int k = 0; k < 100; k++) {
    //
    //      }
    //    }
    //  } //이렇게하면 100만번 실행된다.

    //    -----------------------

    //    for (int i = 2; i < 10; i++) {
    //      System.out.printf("-----%d단-----%n",i);
    //      for (int j = 1; j < 10; j++) {
    //        System.out.println(i + " x " + j + " = " + i * j);
    //      }
    //    }

    //    -----------------------

    //    for(int i = 19; i > 0; i--) {
    //      for(int j = 19; j > 0; j--) {
    //        System.out.println(i + " x " + j + " = " + i * j);
    //      }
    //    }

    //    -----------------------

    //    int number = 0;
    //    while (number < 10) {
    //      System.out.println("현재숫자: " + number);
    //      if (number == 5) {
    //        System.out.println("5가 되었습니다.");
    //        break;
    //      }
    //      number++;
    //    }

    //    -----------------------

    //    for(int i = 0; i < 10; i++) {
    //      System.out.println("현재 i의 값은 = " + i);
    //      for(int j = 0; j < 10; j++) {
    //        System.out.println("현재 j의 값은 = " + j);
    //        if(j==5){
    //          break;
    //        }
    //      }
    //    }

    //    -----------------------

    //    for (int i = 1; i < 101; i++) {
    //      System.out.println(i + "------------");
    //      if (i == 50) {
    //        break;
    //      }
    //      for (int j = 2; j < 101; j++) {
    //        System.out.println(j);
    //        if (j == 80) {
    //          break;
    //        }
    //      }
    //    }


    //    -----------------------

//    for (int i = 1; i < 11; i++) {
//      if (i == 4 || i == 7) continue;
//      System.out.println(i);
//    }

    //    -----------------------


  }
}
