package weeklyQuiz;

public class PremiumShoppingMall extends ShoppingMall {

    public PremiumShoppingMall(int sizeOfProducts) {
        super(sizeOfProducts);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        return product.getStock() >= 10 ? true : false;
    }
}
