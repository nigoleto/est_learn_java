package ormi0613;

public class Test0613 {

  public static void main(String[] args) {
    //        InheritB inheritB = new InheritB();
    //
    //        inheritB.field2 = "필드2";
    ////        inheritB.method2();
    //
    //        inheritB.field1 = 100;
    ////        inheritB.method1();
    //
    //        Money2 money2 = new Money2();
    //
    //        money2.saveMoney();
    //        money2.saveMoney();
    //        money2.invest();

    //        Dog dog = new Dog();
    //        dog.setName("happy");
    //        dog.sleep();
    //        dog.sleep(3);

//    Student student = new Student("name", "a", 1);
//
//    System.out.println(student.name);
//    System.out.println(student.ssn);
//    System.out.println(student.studentNo);

//    Child child = new Child();
//
//    child.method1();
//    child.method2();
//    child.method3();

    int r = 10;

    Calculator calculator = new Calculator();
    System.out.println("원면적" + calculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원면적" + computer.areaCircle(r));
//    computer.say();
//    computer.areaCircle(12);

  }
}
