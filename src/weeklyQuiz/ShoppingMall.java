package weeklyQuiz;

public class ShoppingMall {
  private Product[] products;
  private Product[] products2;

  public ShoppingMall(int sizeOfProducts) {
    this.products = new Product[sizeOfProducts];
  }

  // 제품 목록 출력 ----------------------------
  public void controlProduct() {
    System.out.println();
    System.out.println("----- 제품목록 -----");

    if (isFull()) {
      for (int i = 0; i < products2.length; i++) {
        if (products2[i] != null) {
          System.out.print((i + 1) + " | ");
          System.out.print(products2[i].productName + " - ");
          System.out.println((int) products2[i].productPrice + "원");
        } 
      }
    } else {
      for (int i = 0; i < products.length; i++) {
        if (products[i] != null) {
          System.out.print((i + 1) + " | ");
          System.out.print(products[i].productName + " - ");
          System.out.println((int) products[i].productPrice + "원");
        }
      }
    }

    System.out.println();
  }

  // 제품 추가 ----------------------------
  public void controlProduct(Product product) {

    if (isFull()) {
      System.out.println("목록이 가득찼습니다.");
      products2 = new Product[products.length * 2];
      for (int i = 0; i < products.length; i++) {
        products2[i] = products[i];
        if(products2[i] == null) {
          products2[i] = product;
        }
      }
    }

    for (int i = 0; i < products.length; i++) {
      if (products[i] == null) {
        products[i] = product;
        System.out.print("쇼핑몰 목록에 " + (i + 1) + "번째 제품으로 ");
        System.out.println(product.getProductName() + "이(가) 추가되었습니다.");
        break;
      }
    }
  }

  // 제품 삭제 ----------------------------
  public void controlProduct(int index) {

    products[index - 1] = null;
    System.out.println();
    System.out.println((index) + "번 제품이 삭제되었습니다.");
    System.out.println();
  }

  // 배열이 꽉 찼는지? ----------------------------
  public boolean isFull() {
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null) {
        return false;
      }
    }
    return true;
  }
}
