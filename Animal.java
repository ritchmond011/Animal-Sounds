abstract class Animal {
    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
}

class Bird extends Animal {
    void eat() {
        System.out.println("Birds eat worm or seeds");
    }
    void sleep(){
        System.out.println("Birds sleep for 10-12 hours a day.");
    }
    void makeSound() {
        System.out.println("Tweet Tweet");
    }
}

class Cat extends Animal {
    void eat(){
        System.out.println("Cats eat mouse");
    }
    void sleep(){
        System.out.println("Cat sleep for 12-16 hours a day");
    }
    void makeSound(){
        System.out.println("Meow Meow");
    }
}

class Dog extends Animal {
    void eat(){
        System.out.println("Dog eat bones and meat");
    }
    void sleep(){
        System.out.println("Dog sleep for 12-14 hours a day");
    }
    void makeSound(){
        System.out.println("Arf Arf");
    }

}
