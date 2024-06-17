import java.util.Scanner;

public class Test6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("입력받을 숫자의 개수를 입력하세요");
    int count = scanner.nextInt();

    System.out.println(count + "개의 정수를 입력하세요");
    int[] numbers = new int[count];
    for (int i = 0; i < count; i++) {
        numbers[i] = scanner.nextInt();
    }

    System.out.print("가장 작은 정수: ");

    int min = numbers[0];
    for (int i = 1; i < count; i++) {
        if (min > numbers[i]) {
            min = numbers[i];
        }
    }
    System.out.println(min);

    System.out.print("가장 큰 정수: ");

    int max = numbers[0];
    for (int i = 1; i < count; i++) {
        if (max < numbers[i]) {
            max = numbers[i];
        }
    }
    System.out.println(max);
  }
}
