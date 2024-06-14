package weeklyQuiz;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Food extends Product {
    Calendar cal = Calendar.getInstance();


    LocalDate now = LocalDate.now();
    Date expirationDate;

  public Food(String productName, String productCount, int productPrice, Date expirationDate) {
    super(productName, productCount, productPrice);
    this.expirationDate = expirationDate;
  }

    @Override
    public double calculatePrice() {
        if (now.equals(expirationDate)) {
            return productPrice * 1.2;
        }
        return productPrice;
    }
}
