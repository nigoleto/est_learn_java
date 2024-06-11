public class Test06111 {

    String name;
    String phoneNumber;
    long money;
    int age;

    public Test06111(String name, String phoneNumber, long money, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.age = age;
    }

    public void sayHello() {
    System.out.println("my name is" + name);
    }

    public void sayMoney() {
    System.out.println("내가 가지고 있는 돈은 " + money + "원이야!");
    }

    public void teaching(Student student){
        student.levelUp();
    }

    public void runClass(Student student){
        student.levelDown();
    }
}
