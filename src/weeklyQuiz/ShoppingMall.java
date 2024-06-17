package weeklyQuiz;

public class ShoppingMall {
  private Product[] products;

  public ShoppingMall(int sizeOfProducts) {
    this.products = new Product[sizeOfProducts];
  }


  // 제품 목록 출력
  public void controlProduct(){
    System.out.println("----- 제품목록 -----");
    for (int i = 0; i < products.length; i++) {
      if(products[i] != null){
        System.out.print((i+1) + " | ");
        System.out.print(products[i].productName + " - ");
        System.out.println((int) products[i].productPrice + "원");
      }
    }
  }

  // 제품 추가
  public void controlProduct(Product product) {
    
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null) {
        products[i] = product;
        System.out.print("쇼핑몰 목록에 "+ (i+1) + "번째 제품으로 ");
        System.out.println(product.getProductName() + "이(가) 추가되었습니다.");
        break;
      }
    }
  }

  // 제품 삭제
  public void controlProduct(int index) {
    products[index-1] = null;
  }
}
