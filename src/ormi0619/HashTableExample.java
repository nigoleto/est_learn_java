package ormi0619;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

  public static void main(String[] args) {

    Map<String, String> map = new Hashtable<>();

    Scanner sc = new Scanner(System.in);

    map.put("spring", "qwer");
    map.put("summer", "qwer12345");
    map.put("fall", "qwer123");
    map.put("winter", "qwer123");

    while (true) {
      System.out.println("아이디와 비밀번호를 입력해주세요.");
      System.out.println("아이디: ");
      String id = sc.nextLine();

      System.out.println("비밀번호: ");
      String password = sc.nextLine();

      System.out.println("=============================");

      if (map.containsKey(id)) {
        String mapPassword = map.get(id);
        if (mapPassword.equals(password)) {
          System.out.println("로그인 성공");
          sc.close();
          break;
        } else {
          System.out.println("비밀번호가 일치하지 않습니다.");
        }

      } else {
        System.out.println("입력하신 아이디가 존재하지 않습니다.");
      }
    }
  }
}
