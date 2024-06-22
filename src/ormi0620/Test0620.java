package ormi0620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test0620 {
  public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

      numbers.removeIf((i) -> i % 2 == 0);

//      Iterator<Integer> iterator = numbers.iterator();
//
//      while(iterator.hasNext()){
//          Integer next = iterator.next();
//          if(next % 2 == 0) {
//              iterator.remove();
//          }
//      }
      System.out.println(numbers);




    //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    //    callList(list);
  }

//  public static void callList(List<Integer> integerList) {
//    for (int i : integerList) {
//      System.out.println(i);
//    }
//  }
}
