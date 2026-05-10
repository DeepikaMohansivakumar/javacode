class Division{
    public static void main(String[] args) {
        int [] arr = {10,20,30};
        int a = 20;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic EXception: cannot divide by zero ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bound error");
        }
        finally {
            System.out.println("Hellooo...!");
        }
    }
}