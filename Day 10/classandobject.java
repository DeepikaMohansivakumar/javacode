package Day 10;

public class classandobject {
    int a;
    int b;

    public void sum() {
        int sum = a + b;
        System.out.println("Addition of two numbers is: " + sum);
    }

    public static void main(String[] args) {
        classandobject obj = new classandobject();
        obj.a = 2;
        obj.b = 2;
        obj.sum();
    }
}
