class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @java.lang.Override
    void sound() {
            System.out.println("Dog barks");
    }
}
public class override {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}