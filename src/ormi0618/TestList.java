package ormi0618;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<String>();
    List<String> linkedList = new LinkedList<>();

      long startTime;
      long endTime;

      startTime = System.nanoTime();
      for (int i = 0; i < 10000; i++) {
          arrayList.add(String.valueOf(i));
      }
      endTime = System.nanoTime();
      System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");

      startTime = System.nanoTime();
      for (int i = 0; i < 10000; i++) {
          linkedList.add(0,String.valueOf(i));
      }
      endTime = System.nanoTime();
      System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");
  }
}
