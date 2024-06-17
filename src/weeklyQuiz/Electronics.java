package weeklyQuiz;

public class Electronics extends Product {
  String electronicsBrand;

  public Electronics(
      String productName, int productCount, int productPrice, String electronicsBrand) {
    super(productName, productCount, productPrice);
    this.electronicsBrand = electronicsBrand;
  }

  @Override
  public double calculatePrice() {
    if (electronicsBrand.equalsIgnoreCase("APPLE")) {
      return productPrice * 1.2;
    }
    return productPrice;
  }
}
