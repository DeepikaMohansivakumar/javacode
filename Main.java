import java.util.*;
class BankOperations {
    int balance = 0;
    int pin;
    int enterpin;
    String username;
    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Enter your name: ");
        username = sc.nextLine();
        System.out.println("Set your PIN: ");
        pin = sc.nextInt();
        System.out.println("Account created successfully!");
    }
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();
        if((amount%100==0) || (amount%200==0) || (amount%500==0)){
        System.out.println("Deposited: " + amount);
        balance += amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (balance >= amount && amount>=100 && amount<=100000) {
            if ((amount % 100 == 0) || (amount % 200 == 0) || (amount % 500 == 0)) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
            else{
                System.out.println("Cant withdraw this amount!!");
            }
        }
        else {
            System.out.println("Cant withdraw!!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BankOperations user = new BankOperations();
            user.createAccount();
            int enterpin=sc.nextInt();
            int choice;
                do {
                    System.out.println("1.Deposit");
                    System.out.println("2.Withdraw");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            user.deposit();
                            break;
                        case 2:
                            user.withdraw();
                            break;
                        case 3:
                            user.checkBalance();
                            break;
                        case 4:
                            System.out.println("Thank you, " + user.username + "!");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (choice <= 4);
        }
    }
}