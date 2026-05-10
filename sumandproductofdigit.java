import java.util.*;
public class sumandproductofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ther number: ");

        int num=sc.nextInt();
        System.out.println("Select option 1 for Sum");
        System.out.println("Select option 2 for Product");
        int Sum=0;
        int Product=1;
        System.out.println("Enter the options");
        int options=sc.nextInt();
        while (num!=0){
            int digit = num%10;
            for(int i=0;i<digit;i++) {
                switch (options) {
                    case 1:
                        Sum+=digit;
                        break;
                    case 2:
                        Product*=digit;
                        break;
                    default:
                        System.out.println("Invalidddd");
                }
                num=num/10;
            }
            if(Sum!=0){
                System.out.println("Sum of the digits are: " + Sum);
            }
            if(Product!=1){
                System.out.println("Product of the digits are:" + Product);
            }
        }
    }
}