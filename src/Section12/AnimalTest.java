package Section12;

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("*** Hierarchy example ***");
        System.out.println("Father class, I'm an animal");
        var animal1 = new Animal();
        //animal1.eat();
        //animal1.sleep();
        System.out.println("Child class, I'm a dog");
        var dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();

    }
}
