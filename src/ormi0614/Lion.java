package ormi0614;

public class Lion extends Animal implements Predator{
    @Override
    public String getFood() {
        return "feed fish";
    }
}
