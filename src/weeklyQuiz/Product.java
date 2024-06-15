package weeklyQuiz;

public class Product {
  String productName;
  String productCount;
  double productPrice;

  public Product(String productName, String productCount, double productPrice) {
    this.productName = productName;
    this.productCount = productCount;
    this.productPrice = productPrice;
  }

  public double calculatePrice() {
    return productPrice;
  }

  public String getProductName() {
    return productName;
  }

  public String getProductCount() {
    return productCount;
  }

}
