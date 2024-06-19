package weeklyQuiz;

public class Electronics extends Product {
  private String brand;

  public Electronics(String name, int stock, int price, String brand) {
    super(name, stock, price);
    this.brand = brand;
  }

  @Override
  public double calculatePrice() {
    if (brand.equalsIgnoreCase("APPLE")) {
      return getPrice() * 1.2;
    }
    return getPrice();
  }
}
