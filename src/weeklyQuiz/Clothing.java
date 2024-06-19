package weeklyQuiz;

public class Clothing extends Product {
  private String clothingSize;

  public Clothing(String name, int stock, double price, String clothingSize) {
    super(name, stock, price);
    this.clothingSize = clothingSize;
  }

  @Override
  public double calculatePrice() {
    //      return switch (clothingSize.toUpperCase()) {
    //          case "L", "XL", "XXL" -> price * 1.1;
    //          default -> price;
    //      };
    if (clothingSize.toUpperCase().contains("L")) {
      return getPrice() * 1.1;
    }
    return getPrice();
  }
}
