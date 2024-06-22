package ormi0620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 10, 9, 5, 20));
    numbers.stream()
            .filter(i -> i % 2 == 0)
            .forEach(i -> System.out.println(i));



//            int[] array = {1,2,3,4,5};
//            IntStream stream = Arrays.stream(array);
//
//            Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);


    List<Integer> collect = numbers.stream().map(integer -> integer * 2)
            .collect(Collectors.toList());

    for (Integer i : collect) {
      System.out.println(i);
    }

    System.out.println("===============================");

    numbers.stream().sorted().forEach(i -> System.out.println(i));
  }
}
