package Lab.A_defininigClasses.A_BankAccountTestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            String commands = tokens[0];
            switch (commands) {
                case "Create":
                    createBankAccount(Integer.valueOf(tokens[1]));
                    break;
                case "Deposit":
                    depositSum(Integer.valueOf(tokens[1]), Double.valueOf(tokens[2]));
                    break;
                case "Withdraw":
                    withdrawSum(Integer.valueOf(tokens[1]), Double.parseDouble(tokens[2]));
                    break;
                case "Print":
                    getPrint(Integer.valueOf(tokens[1]));
                    break;
            }
        }
    }

    private static void getPrint(int id) {
        if (accounts.containsKey(id)) {

            System.out.println(accounts.get(id));
        } else {
            System.out.println("Account does not exist");
        }

    }

    private static void withdrawSum(int id, double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).withdraw(amount);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void depositSum(int id, double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(amount);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createBankAccount(int id) {
        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount ba = new BankAccount(id);
            accounts.put(id, ba);
        }
    }
}
