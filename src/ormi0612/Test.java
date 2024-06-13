package ormi0612;

import ormi0612.car.Car;
import ormi0612.car.example.Sonata;
import ormi0612.house.HouseKim;

public class Test {

  public static void main(String[] args) {

    HouseKim houseKim = new HouseKim();
    houseKim.firstName = "LEE";

    Car car = new Car(2);
    car.setSpeed(120);
    car.checkSpeed();

    Sonata sonata = new Sonata();
  }
}
