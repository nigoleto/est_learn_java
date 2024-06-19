package weeklyQuiz;

public abstract class ShoppingMall {
  private Product[] products;

  public ShoppingMall(int sizeOfProducts) {
    this.products = new Product[sizeOfProducts];
  }

  Product[] products2;

  public abstract boolean checkOrderAvailability(Product product);

    // --------------- 오버로딩 ---------------
  // 1. 제품 목록 출력 ---------------------
  public void controlProduct() {
    if (products2 != null) {
      displayProducts(products2);
    } else {
      displayProducts(products);
    }
  }

  // 2. 제품 추가 --------------------------
  public void controlProduct(Product product) {
    if (isFull() && products2 == null) {
      createProductArr();
    }

    if (products2 != null) {
      addProduct(products2, product);
    } else addProduct(products, product);
  }

  // 3. 제품 삭제 ---------------------------
  public void controlProduct(Product product, String productName) {
    if (products2 != null) {
      removeProduct(products2, product, productName);
    } else removeProduct(products, product, productName);
  }



  // 배열이 꽉 찼는지?
  public boolean isFull() {
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null) {
        return false;
      }
    }
    return true;
  }

  // 새로운 배열 생성
  public void createProductArr() {
    products2 = new Product[products.length * 2];
    System.out.println("제품목록이 늘어났습니다.");
    for (int i = 0; i < products.length; i++) {
      products2[i] = products[i];
    }
  }

  // 제품 삭제
  public void removeProduct(Product[] products, Product product, String productName) {
    for (int i = 0; i < products.length; i++) {

      if (products[i].getName().equals(productName) && products[i] == product) {
        products[i] = null;
        System.out.println();
        System.out.println((i + 1) + "번 제품이 삭제되었습니다.");
        System.out.println();
        break;
      }
    }
  }

  // 배열 출력
  public void displayProducts(Product[] products) {
    System.out.println();
    System.out.println("----- 제품목록 -----");

    for (int i = 0; i < products.length; i++) {
      if (products[i] != null) {
        System.out.print((i + 1) + " | ");
        System.out.print(products[i].getName() + " - ");
        System.out.println((int) products[i].calculatePrice() + "원");
      }
    }

    System.out.println();
  }

  // 제품 추가 -------------------------
  public void addProduct(Product[] products, Product product) {
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null) {
        products[i] = product;
        System.out.print("쇼핑몰 목록에 " + (i + 1) + "번째 제품으로 ");
        System.out.println(product.getName() + "이(가) 추가되었습니다.");
        break;
      }
    }
  }
}
