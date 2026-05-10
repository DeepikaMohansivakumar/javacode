import java.util.*;
class user{
    String userName;
    int pin;
    Scanner sc=new Scanner(System.in);
    public user(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        userName=sc.nextLine();
        System.out.println("Your name: "+userName);
    }
    public user(int pin){
        System.out.println("Your pin: "+pin);
    }
}
class ATM extends user{
    int balance;
    int input;
    public ATM(int balance){
        super(balance);
        //System.out.println("Your balance : "+balance);
    }
    public ATM(){
        super();
    }
}
public class Banktask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM d=new ATM();
        ATM ad=new ATM(1234);
    }
}