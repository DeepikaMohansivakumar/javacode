//upcasting is creating an object with reference of parent class
//eg:animal is an parent class and dog is an child class then the object will be created using upcasting using
// Animal obj=new Dog()
//but the thing is here the methods inside animals are only accessible methods inside dogs are not accessible with
//that object because of the reference class
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void playwithToys(){
        System.out.println("Happyyy........");
    }

    void makesound() {
        System.out.println("Barks..");
    }
}
class Upcasting{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog d =(Dog)dog;
        dog.sound();
        d.makesound();//downcasting
        d.playwithToys();
    }
}