package Lab.A_defininigClasses.B_StaticIdAndInterestRate;

public class BankAccounts {
    private static double interestRate = 0.02;
    private static int counter = 1;

    private int id;
    private double balanced;

    public BankAccounts() {
        this.id = counter++;
    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccounts.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return this.balanced * interestRate * years;
    }

    public void deposit(double amount) {
        balanced += amount;
    }
}
