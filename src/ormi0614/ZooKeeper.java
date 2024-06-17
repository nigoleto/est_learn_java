package ormi0614;

public class ZooKeeper {

  public void feed(Predator predator) {
    System.out.println(predator.getFood());
  }

  public void feed2(Herbivore herbivore) {
    System.out.println(herbivore.getFood());
  }
}
