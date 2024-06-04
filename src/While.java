import java.util.stream.IntStream;

public class While {

  public static void main(String[] args) {
    //    int i = 1;
    //
    //    while (i <= 5) {
    //      System.out.println("현재 i의 값은 = " + i++);
    //    }

    //    ____________________________________

    //    int countDown = 10;
    //
    //    while(countDown >= 0){
    //      System.out.println("현재 카운트 : " + countDown);
    //      countDown--;
    //    }
    //    System.out.println("카운트 종료");

    //    ____________________________________

    //    int sumNum = 0, i = 1;
    //
    //    while(i < 101){
    //      sumNum += i++;
    //    }
    //
    //    System.out.println(sumNum);

    //    ____________________________________

    //    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    //    int i = 0, sum = 0;
    //
    //    while(i < numbers.length){
    //      sum += numbers[i++];
    //    }
    //    System.out.println(sum / numbers.length);

    //    ____________________________________

    //    int i = 3;
    //    while(i<=300){
    //      System.out.println(i);
    //      i += 3;
    //    }

    //    ____________________________________

    //    int i = 0;
    //    while(i<=300){
    //      if (i % 3 == 0) {
    //        System.out.println(i);
    //      }
    //      i ++;
    //    }

    //    ____________________________________

    //    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    //    int i = 0, answer = 0;
    //
    //    while(i < numbers.length){
    //      answer = Math.max(numbers[i], answer);
    //      i++;
    //    }
    //    System.out.println(answer);

    //    ____________________________________

    //    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    //
    //    int max = numbers[0];
    //    int i = 1;
    //    while(i<numbers.length){
    //      if (numbers[i] > max) {
    //        max = numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println(max);

    //    ____________________________________

//    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
//    int i = 0, plus = 0, minus = 0;
//
//    while(i < numbers.length){
//      if(numbers[i] > 0){
//        plus += numbers[i];
//      }else{
//        minus += numbers[i];
//      }
//      i++;
//    }
//
//    System.out.println(plus);
//    System.out.println(minus);

    //    ____________________________________

    int[] arr = {1, 2, 3, 4};

    System.out.println(IntStream.of(arr).sum());
  }
}
