package ormi0619;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {

  public static void main(String[] args) {

    Map<Student, Integer> hashMap = new HashMap<>();

    Student student1 = new Student(1, "이름1");
    Student student2 = new Student(2, "이름2");
    Student student3 = new Student(3, "이름3");
    Student student4 = new Student(4, "이름3");

    hashMap.put(student1, 80);
    hashMap.put(student2, 90);
    hashMap.put(student3, 75);
    hashMap.put(student4, 80);

    Set<Map.Entry<Student, Integer>> entrySet = hashMap.entrySet();

    for (Map.Entry<Student, Integer> entry : entrySet) {
      Student key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(key.no + "번 학생 " + key.name + "의 점수는: ");
      System.out.println(value + "점");
    }
  }
}
