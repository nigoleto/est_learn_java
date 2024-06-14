package ormi0614;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private int balance;

    public void withdraw(int amount) throws InsufficientBalanceException{
        if(balance < amount) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
        balance -= amount;
    }
}
