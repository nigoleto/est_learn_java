import java.util.Scanner;

public class Test0611 {

    public static void main(String[] args){
        Test06111 person = new Test06111("홍길동","01020504030",2345451332L, 1324543);
        Test06111 person1 = new Test06111("고길동","01065709030",2345451332L, 1324543);
        Test06111 person2 = new Test06111("김철수","01021434030",2345451332L, 1324543);
        Test06111 person3 = new Test06111("안철수","01023404030",2345451332L, 1324543);

//        Student ormi = new Student();
//
//        person.sayMoney();
//        person.teaching(ormi);
//        person.runClass(ormi);

        Scanner scanner = new Scanner(System.in);

    // 계좌생성
    System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();
    System.out.print("소유자 이름을 입력하세요: ");
        String ownerName = scanner.nextLine();
        BankAccount account = new BankAccount(accountNumber, ownerName);

        // 입금 및 출금
        System.out.println(account.ownerName + "님께서");
        account.deposit(234520003);
        account.withdraw(210234500);

        // 잔액조회
        account.printMoney();

        scanner.close();
    }
}
