import java.util.*;
public class Dog{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = '9';
        if((ch>='0')&&(ch<='9')) {
            System.out.println("Digit");
        }
        else if((ch>='a')&&(ch<='z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}