package ormi0617;

public class Test0617 {

  public static void main(String[] args) {
    //    InterfaceC impleC = new ImpleC();
    //
    //    InterfaceA interfaceA = impleC;
    //    interfaceA.methodA();
    //    System.out.println("==========================");
    //
    //    InterfaceB interfaceB = impleC;
    //    interfaceB.methodB();
    //    System.out.println("==========================");
    //
    //    impleC.methodA();
    //    impleC.methodB();
    //    impleC.methodC();

    //    Car kiaCar = new KiaCar();
    //
    //    System.out.println(kiaCar.getTire());
    //
    //    System.out.println(kiaCar.showEngine());
    //
    //    System.out.println(kiaCar.amountNavi());

    //  ProfileService profileService =  new ProfileService();
    //  profileService.saveProfile();

//    System.out.println("=====================");
    //    Box<String> stringBox = new Box<>();
    //    stringBox.set("스트");
    //    System.out.println(stringBox.get());
    //
    //    Box<Integer> intBox = new Box<>();
    //    intBox.set(12);
    //    System.out.println(intBox.get());
    //
    //    System.out.println("=======================");
    //
    //    Car1<String> car1 = new Car1<>();
    //
    //    car1.setCar1("큰자동차");
    //    System.out.println(car1.getCar1());
    //    System.out.println(car1.isString());
    //
    //    Car1<Double> car2 = new Car1<>();
    //    car2.setCar1(4.324);
    //    System.out.println(car2.getCar1());
    //    System.out.println(car2.isString());

    Box<String> boxing = Util.boxing("123123");
  }
}
