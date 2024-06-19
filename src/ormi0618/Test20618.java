package ormi0618;

import java.util.ArrayList;
import java.util.List;

public class Test20618 {

  public static void main(String[] args) {
    ChildProduct<Tv, String, String> product = new ChildProduct<>();
    product.setKind(new Tv());
    product.setModel("smart TV");
    product.setCompany("SAMSUNG");

    StorageImpl<Tv> tvStorage = new StorageImpl<>(100);
    tvStorage.add(new Tv(), 0);

    // ---------------------------------------

    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servlet/JSP");
    arrayList.add("DBMS");
    arrayList.add("JPA");

    System.out.println("총 객체수: " + arrayList.size());

    System.out.println(arrayList.get(2));

    arrayList.add(2,"추가된홍길동");

    System.out.println(arrayList.get(2));

  }
}
