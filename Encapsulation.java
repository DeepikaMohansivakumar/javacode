class Bank {
    //Instance variable
    private int pin = 1234;

    public int getPin() {

        return pin;
    }

    public void setPin(int pin) {
        //local variable
        this.pin = pin;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Bank ab=new Bank();
        System.out.println(ab.getPin());
        ab.setPin(5008)
        System.out.println(ab.getPin());
    }
}