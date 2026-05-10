abstract class meat{
    abstract void chicken(double price);
    abstract void mutton(int weight);
    abstract void fish(String type);
    abstract void prawn();
}
abstract class abMeats extends meat{
    double price;
    int weight;
    String type;

    abstract void chicken(double price);

    abstract void mutton(int weight);

    abstract void fish(String type);

    abstract void prawn();
}
class abMeat2 extends abMeats{
    double price;
    int weight;
    String type;

    void chicken(double price) {
        System.out.println("Welcome to abMeats");
        System.out.println("Thanks for shopping chicken");
        System.out.println("Price :" +price);
    }

    void mutton(int weight) {
        System.out.println("Welcome to abMeats");
        System.out.println("We have " +weight+ "kg mutton");
    }

    void fish(String type) {
        System.out.println("Welcome to abMeats");
        System.out.println("we have " +type+ " fish");
    }

    void prawn() {
        System.out.println("Welcome to abMeats");
        System.out.println("Now prawns are out of stock");
    }
}
class meatAndEat extends meat{
    double price;
    int weight;
    String type;

    void chicken(double price) {
        System.out.println("Welcome to Meat and Eat");
        System.out.println("Thanks for shopping chicken");
        System.out.println("Price :" +price);
    }

    void mutton(int weight) {
        System.out.println("Welcome to Meat and Eat");
        System.out.println("We have " +weight+ "kg mutton");
    }

    void fish(String type) {
        System.out.println("Welcome to Meat and Eat");
        System.out.println("We have " +type+ " fish");
    }

    void prawn() {
        System.out.println("Welcome to Meat and Eat");
        System.out.println("Now prawns are out of stock");
    }
}
class Abstraction{
    public static void main(String[] args){
        abMeat2 buy=new abMeat2();
        buy.prawn();
        buy.fish("Salmon");
        meatAndEat classy=new meatAndEat();
        classy.chicken(800.0);
    }
}