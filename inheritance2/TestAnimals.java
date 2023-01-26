package inheritance2;

class Animal {

    public void sound() {
        System.out.println("Generic sound");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("aww aww");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}

public class TestAnimals {

    public static void main(String args[]) {
        // POLYMORPHISM
        Animal animal = new Animal();   // Animal reference and object
        Animal dog = new Dog();   // Animal reference but Dog object
        Animal cat = new Cat();   // Animal reference but Cat object

        animal.sound();   // generic
        dog.sound();      // Dog sound
        cat.sound();      // Cat sound
    }
}
