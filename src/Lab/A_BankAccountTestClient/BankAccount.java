package Lab.A_BankAccountTestClient;

public class BankAccount {
    private int id;
    private double balanced;

    public BankAccount(int id, double balanced) {
        this.id = id;
        this.balanced = balanced;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalanced() {
        return this.balanced;
    }

    public void setBalanced(double balanced) {
        this.balanced = balanced;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balanced += amount;
        }
    }

    public void withdraw(double amount) {
        if (this.balanced - amount > 0) {
            this.balanced -= amount;
        } else {
            System.out.println("Insufficient balance");
        }

    }


}
