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
public class Constructor(){
    Coffee wow=new Coffee();
}