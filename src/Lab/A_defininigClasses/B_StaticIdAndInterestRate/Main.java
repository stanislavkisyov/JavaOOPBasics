package Lab.A_defininigClasses.B_StaticIdAndInterestRate;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, BankAccounts> accountsMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");

            String commands = tokens[0];
            switch (commands) {
                case "Create":
                    createBank();
                    break;
                case "Deposit":
                    depositSum(Integer.parseInt(tokens[1]), Double.valueOf(tokens[2]));
                    break;
                case "SetInterest":
                    setInterest(Double.parseDouble(tokens[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]));
                    break;
            }
        }
    }

    private static void getInterest(Integer id, int years) {
        if (accountsMap.containsKey(id)) {

            System.out.printf("%.2f\n", accountsMap.get(id).getInterest(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(double interest) {
        BankAccounts.setInterestRate(interest);
    }

    private static void depositSum(int id, Double amount) {
        if (accountsMap.containsKey(id)) {
            accountsMap.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to ID%d\n", amount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createBank() {
        BankAccounts bankAccounts = new BankAccounts();
        accountsMap.put(bankAccounts.getId(), bankAccounts);
        System.out.printf("Account ID%d created\n", bankAccounts.getId());
    }


}
