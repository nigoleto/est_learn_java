package weeklyQuiz;

import java.time.LocalDate;
import java.util.Date;

public class Week {

  public static void main(String[] args) {
    LocalDate customDate = LocalDate.of(2024, 6, 27);

    Product product1 = new Food("apple", 5, 20000, customDate);
    Product product2 = new Food("banana", 30, 4000, customDate);
    Product product3 = new Clothing("newJean", 20, 10000, "l");
    Product product4 = new Clothing("shirt", 10, 15000, "xxl");
    Product product5 = new Electronics("phone", 50, 400000, "SAMSUNG");
    Product product6 = new Electronics("moniter", 50, 300000, "Apple");
    Product product7 = new Electronics("computer", 10, 900000, "Apple");

    ShoppingMall shoppingMall = new ShoppingMall(2);

    shoppingMall.controlProduct(product1);
    shoppingMall.controlProduct(product2);
    shoppingMall.controlProduct(product3);

    shoppingMall.controlProduct();

    shoppingMall.controlProduct(2);
    shoppingMall.controlProduct();

    shoppingMall.controlProduct(product4);
    shoppingMall.controlProduct();


  }
}
