package weeklyQuiz;

public class Clothing extends Product {
  String clothingSize;

  public Clothing(String productName, int productCount, double productPrice, String clothingSize) {
    super(productName, productCount, productPrice);
    this.clothingSize = clothingSize;
  }

  @Override
  public double calculatePrice() {
    //    if (clothingSize > 3) {
    //      return productPrice * 1.1;
    //    }
    //    return productPrice;

    //      return switch (clothingSize.toUpperCase()) {
    //          case "L", "XL", "XXL" -> productPrice * 1.1;
    //          default -> productPrice;
    //      };
    if (clothingSize.toUpperCase().contains("L")) {
      return productPrice * 1.1;
    }
    return productPrice;
  }
}
