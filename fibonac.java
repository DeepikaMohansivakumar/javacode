class fibonac{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        for(i=1;i<=10;i++){
            System.out.println(a);
            int next = a+b;
            a = b;
            b = next;
        }
    }
}