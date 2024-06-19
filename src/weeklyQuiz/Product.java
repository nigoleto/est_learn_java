package weeklyQuiz;

public class Product {
  private String name;
  private int stock;
  private double price;

  public Product(String name, int stock, double price) {
    this.name = name;
    this.stock = stock;
    this.price = price;
  }

  public double calculatePrice() {
    return price;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public int getStock() {
    return stock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
