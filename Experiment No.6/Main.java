// Low Balance Exception
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

// Negative Number Exception
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 1000;

    void balanceEnquiry() {
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Negative amount not allowed");
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Negative amount not allowed");
        if (amount > balance)
            throw new LowBalanceException("Insufficient balance");
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.balanceEnquiry();
            b.deposit(500);
            b.withdraw(200);
            b.withdraw(2000);   // will throw exception
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        b.balanceEnquiry();
    }
}