// Grandparent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Parent class
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling methods from different levels of inheritance
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Defined in Dog
    }
}
