import java.util.*;
class User {

    private String userName;
    private int userPin;
    User(String userName, int userPin) {
        this.userName = userName;
        this.userPin = userPin;
    }
    public String getUserName() {
        return userName;
    }
    public int getUserPin() {
        return userPin;
    }
}
class Bank extends User {
    int balance;
    Bank(String userName, int userPin, int balance) {
        super(userName, userPin);
        this.balance = balance;
    }
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void showBalance() {
        System.out.println(getUserName() + " Balance: " + balance);
    }
    public boolean validatePin(int enteredpin) {
        if (getUserPin() == enteredpin) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validateUser(String enteredUserName) {
        if (getUserName().equals(enteredUserName)) {
            return true;
        } else {
            return false;
        }
    }
    public void transferAmount(Bank receiver, int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Amount transferred successfully");
        } else {

            System.out.println("Insufficient Balance");
        }
    }
}
public class Bankop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank user1 = new Bank("Deepika", 1568, 5000);
        Bank user2 = new Bank("Kaviya", 4321, 3000);
        System.out.print("Enter your name: ");
        String enteredUserName = sc.nextLine();
        System.out.print("Enter your pin: ");
        int enteredpin = sc.nextInt();

        if (user1.validateUser(enteredUserName)
                && user1.validatePin(enteredpin)) {

            System.out.println("\nLogin Successful");
            int choice;
            do {
                System.out.println("\n===== BANK MENU =====");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Transfer Amount");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        user1.deposit(depositAmount);
                        break;

                    case 2:

                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();

                        user1.withdraw(withdrawAmount);

                        break;

                    case 3:

                        user1.showBalance();

                        break;

                    case 4:

                        System.out.print("Enter amount to transfer: ");
                        int transferAmount = sc.nextInt();

                        user1.transferAmount(user2, transferAmount);

                        System.out.println("\nAfter Transfer:");

                        user1.showBalance();

                        user2.showBalance();

                        break;

                    case 5:

                        System.out.println("Thank You for Using Bank System");

                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } while (choice != 5);

        } else {

            System.out.println("Invalid username or password");
        }

        sc.close();
    }
}