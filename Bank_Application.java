package Bank_Application;

import java.util.*;

public class Bank {

    static class Account {
        private int AccountNumber;
        private String UserName;
        private String Password;
        private double Balance;

        public Account(int AccountNumber, String UserName, String Password, double Balance) {
            this.AccountNumber = AccountNumber;
            this.UserName = UserName;
            this.Password = Password;
            this.Balance = Balance;
        }

        public int getAccountNumber() {
            return AccountNumber;
        }

        public String getUserName() {
            return UserName;
        }

        public boolean ValidPassword(String pwd) {
            return Password.equals(pwd);
        }

        // Deposit
        public void Deposit(double amount) {
            Balance += amount;
        }

        // Withdraw
        public boolean Withdraw(double amount) {
            if (amount > Balance)
                return false;
            Balance -= amount;
            return true;
        }

        public double getBalance() {
            return Balance;
        }
    }

    static Account acc;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Create Account");
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter User Name: ");
        String name = sc.next();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        acc = new Account(accNo, name, pass, bal);

        // Login
        System.out.println("\nLogin");
        System.out.print("Enter Account Number: ");
        int no = sc.nextInt();
        System.out.print("Enter Password: ");
        String pwd = sc.next();

        if (acc.getAccountNumber() == no && acc.ValidPassword(pwd)) {
            menu();
        } else {
            System.out.println("Invalid Login");
        }
    }

    static void menu() {
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Amount: ");
                acc.Deposit(sc.nextDouble());
            } 
            else if (ch == 2) {
                System.out.print("Amount: ");
                if (!acc.Withdraw(sc.nextDouble()))
                    System.out.println("Insufficient Balance");
            } 
            else if (ch == 3) {
                System.out.println("Balance: " + acc.getBalance());
            } 
            else {
                break;
            }
        }
    }
}
