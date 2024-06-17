package weeklyQuiz;

public class Product {
  String productName;
  int productCount;
  double productPrice;

  public Product(String productName, int productCount, double productPrice) {
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

  public int getProductCount() {
    return productCount;
  }
}
