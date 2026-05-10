class Coffee{
    String typeOfCoffee;
    int price;
    //Default Constructor
    public Coffee(){
        System.out.println("Heyyy Here is your Coffee");
    }
    //Parameterized Constructor
    public Coffee(String typeOfCoffee,int price){
        this.typeOfCoffee=typeOfCoffee;
        this.price=price;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Coffee wow = new Coffee("Dark chocolate \n", 1000);
        System.out.println(wow.typeOfCoffee + wow.price);
    }
}