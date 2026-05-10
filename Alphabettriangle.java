import java.util.*;
public class Alphabettriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //char ch= 'A';
        for(int i=1;i<=n;i++){
            char ch= 'A'; //-- A AB ABC ABCD
            for(int j=1;j<=i;j++){
                System.out.print(ch+ " ");
                ch++; //-- A BC DEF
            }
            System.out.println();
            //ch++; //-A BB CCC DDDD
        }
    }
}