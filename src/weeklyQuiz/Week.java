package weeklyQuiz;

import java.time.LocalDate;
import java.util.Date;

public class Week {

  public static void main(String[] args) {
    LocalDate date240623 = LocalDate.of(2024, 6, 23);
    LocalDate date230630 = LocalDate.of(2024, 6, 30);

    Product product1 = new Food("apple", 5, 20000, date240623);
    Product product2 = new Food("banana", 30, 4000, date230630);
    Product product3 = new Clothing("newJean", 20, 10000, "M");
    Product product4 = new Clothing("shirt", 10, 15000, "xxl");
    Product product5 = new Electronics("phone", 50, 400000, "SAMSUNG");
    Product product6 = new Electronics("moniter", 50, 300000, "Apple");
    Product product7 = new Electronics("computer", 10, 900000, "apple");

    System.out.println(product1.calculatePrice()); //현재날짜: 240619 -> 20%할인
    System.out.println(product2.calculatePrice()); //정가

    System.out.println(product3.calculatePrice()); //정가
    System.out.println(product4.calculatePrice()); //L이상 사이즈 10% 추가

    System.out.println(product5.calculatePrice()); //정가
    System.out.println(product6.calculatePrice()); //apple상품 20%추가
    System.out.println(product7.calculatePrice()); //apple상품 20%추가


    //    ShoppingMall shoppingMall = new PremiumShoppingMall(4);
    //
    //    shoppingMall.controlProduct(product1);
    //    shoppingMall.controlProduct(product2);
    //    shoppingMall.controlProduct();
    //
    //    shoppingMall.controlProduct(product3);
    //    shoppingMall.controlProduct(product4);
    //    shoppingMall.controlProduct();
    //
    //    shoppingMall.controlProduct(product3, "newJean");
    //    shoppingMall.controlProduct();
    //
    //    shoppingMall.controlProduct(product5);
    //    shoppingMall.controlProduct(product6);
    //    shoppingMall.controlProduct();
    //
    //    System.out.println(shoppingMall.checkOrderAvailability(product1));
    //    System.out.println(shoppingMall.checkOrderAvailability(product2));
  }
}
