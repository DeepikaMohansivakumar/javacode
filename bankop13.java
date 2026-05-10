import java.util.*;
class User {
    String userName;
    private int userPin;
    User(String userName, int userPin) {
        this.userName = userName;
        this.userPin = userPin;
    }

    public String getUserName() {
        System.out.println("User Name:" + userName);
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getUserPin() {
        System.out.println("Your pin:" + userPin);
        return userPin;
    }
}
class Bank extends User {
    int balance;
    Bank(String userName, int userPin, int balance) {
        super(userName, userPin);
        this.balance = balance;
    }
    private void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public int getBalance() {
        System.out.println("Balance:" + balance);
        return balance;
    }
    public boolean validatePin(int enteredpin){
        if(this.userPin==enteredpin){
            System.out.println("Pin verified successfully");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validateUser(String enteredUserName){
        if(this.userName.equals(enteredUserName)){
            System.out.println("Name verified successfully");
            return true;
        }
        else{
            return false;
        }

    }
}
public class bankop13 {
    public static void main(String[] args) {
        Bank user1 = new Bank("Deepika", 1568, 5000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String enteredUserName = sc.nextLine();
        System.out.println("Enter your pin:");
        int enteredpin = sc.nextInt();
        if (user1.validateUser(enteredUserName) && user1.validatePin(enteredpin)) {
            user1.getBalance();

        }
        else {
            System.out.println("Invalid username or password ");
        }
    }
}