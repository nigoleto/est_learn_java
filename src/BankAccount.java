public class BankAccount {
  String accountNumber;
  String ownerName;
  long money;

  public BankAccount(String accountNumber, String ownerName) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.money = 0;
  }

  public void deposit(int number) {
    if (number > 0) {
      money += number;
      System.out.println(number + "원을 입금하셨습니다.");
      //    System.out.println("현재 통장 잔고는 " + money + "원 입니다.");
    }
    System.out.println("유효하지 않은 금액입니다.");
  }

  public void withdraw(int number) {
    if (money >= number) {
      money -= number;
      System.out.println(number + "원을 출금하셨습니다.");
      //    System.out.println("현재 통장 잔고는 " + money + "원 입니다.");
    }
    System.out.println("잔고가 부족합니다.");
  }

  public void printMoney() {
    System.out.println("현재 통장 잔고는 " + money + "원 입니다.");
  }
}
