package ormi0614;

public class Tiger extends Animal implements Predator{
    @Override
    public String getFood() {
        return "feed meet";
    }
}
