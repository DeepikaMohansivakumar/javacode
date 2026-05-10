class ExceptionHandlingCompile{
    static void add(int a,int b){
        System.out.println(a/b); // it returns the op of division soo ite logical error
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=0;
        //Println is an error it should be println
        System.out.Println("Heyyyyyy");
        System.out.println(a/c); //Arithmetic exception bcz anything by 0 is infinity
        int arr[]=new int[3];
        System.out.println(arr[10]);//Runtime error
    }
}