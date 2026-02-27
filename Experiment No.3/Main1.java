// Base Class
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw! Minimum balance should be 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

// Main Class
public class Main1{
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(500);
        acc.deposit(200);
        acc.withdraw(550);
        acc.display();
    }
}