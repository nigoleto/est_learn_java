package weeklyQuiz;

public class Electronics extends Product {
  String electronicsBrand;

  public Electronics(String productName, String productCount, int productPrice, String electronicsBrand) {
    super(productName, productCount, productPrice);
    this.electronicsBrand = electronicsBrand;
  }

  @Override
  public double calculatePrice() {
    if (electronicsBrand.equals("Apple")) {
      return productPrice * 1.2;
    }
    return productPrice;
  }
}
