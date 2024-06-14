package weeklyQuiz;

public class Clothing extends Product {
  int clothingSize;

  public Clothing(String productName, String productCount, double productPrice, int clothingSize) {
    super(productName, productCount, productPrice);
    this.clothingSize = clothingSize;
  }

  @Override
  public double calculatePrice() {
    if (clothingSize > 3) {
      return productPrice * 1.1;
    }
    return productPrice;
  }
}
