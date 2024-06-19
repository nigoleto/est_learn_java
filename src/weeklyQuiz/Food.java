package weeklyQuiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {

  private LocalDate expirationDate;

  public Food(String name, int stock, int price, LocalDate expirationDate) {
    super(name, stock, price);
    this.expirationDate = expirationDate;
  }

  LocalDate today = LocalDate.now();

  @Override
  public double calculatePrice() {
    if (ChronoUnit.DAYS.between(today, expirationDate) <= 7) {
      return getPrice() * 0.8;
    }
    return getPrice();
  }
}
