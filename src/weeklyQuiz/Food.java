package weeklyQuiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {

  LocalDate expirationDate;

  public Food(String productName, int productCount, int productPrice, LocalDate expirationDate) {
    super(productName, productCount, productPrice);
    this.expirationDate = expirationDate;
  }

  LocalDate today = LocalDate.now();

  @Override
  public double calculatePrice() {
    if (ChronoUnit.DAYS.between(today, expirationDate) <= 7) {
      return productPrice * 0.8;
    }
    return productPrice;
  }
}
