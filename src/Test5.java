import java.util.Arrays;
import java.util.List;

public class Test5 {


  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3);
    System.out.println(list.get(2));


    int[] arr2 = {1,2,3,4,5};
    System.out.println(arr2);

    int[] arr3 = new int[5];
    System.out.println(arr3[0]);

    String name = "name";
    String name2 = new String("new name");
    String[] arr = {"arr1","arr2","arr3"};
  }
}
