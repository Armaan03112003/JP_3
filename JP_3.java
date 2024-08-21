// Parent class (Superclass)
class Animal {
    // Method in the parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    // Method in the child class
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the inheritance
public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the child class
        Dog myDog = new Dog();

        // Call the method from the parent class
        myDog.eat();

        // Call the method from the child class
        myDog.bark();
    }
}
