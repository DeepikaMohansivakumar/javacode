class ExceptionHandling{
    public static void main(String[] args) {
        int a=10;
        int b=1;
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[1]);
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Cant do this operation ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index ");
        }
        System.out.println("byeeeeeeeeeeeee...");
    }
}