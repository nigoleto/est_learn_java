package ormi0614;

public class Deer extends Animal implements Herbivore{
    @Override
    public String getFood() {
        return "feed radish";
    }
}
