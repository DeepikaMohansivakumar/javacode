import java.util.*;
class panda{
    int add(){
        return 1+1;
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b,double c,double d){
        return a+b+c+d;
    }
}
class Learn{
    public static void main(String[] args) {
        panda white=new panda();
        System.out.println(white.add());
        System.out.println(white.add(8,8,9,7));
        System.out.println(white.add(56,58));
        System.out.println(white.add(3,4,7));
    }
}