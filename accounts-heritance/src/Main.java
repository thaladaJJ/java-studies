import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);

        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Bia", 1000.0, 0.01);   // upcasting
        acc2.withdraw(200.0);

        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Luan", 1000.0, 500.0);
        acc3.withdraw(200.0);

        System.out.println(acc3.getBalance());
        System.out.println();

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}