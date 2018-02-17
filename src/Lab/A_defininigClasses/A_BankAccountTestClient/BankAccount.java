package Lab.A_defininigClasses.A_BankAccountTestClient;

public class BankAccount {
    private int id;
    private double balanced;

    public BankAccount(int id) {
        this.id = id;
        this.balanced = 0.0;
    }

    public void deposit(double amount) {
        this.balanced += amount;
    }

    public void withdraw(double amount) {
        if (this.balanced - amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            this.balanced -= amount;
        }

    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balanced);
    }
}
