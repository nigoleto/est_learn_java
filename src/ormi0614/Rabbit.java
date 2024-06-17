package ormi0614;

public class Rabbit extends Animal implements Herbivore{
    @Override
    public String getFood() {
        return "feed carrot";
    }
}
