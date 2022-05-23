package lesson22;

public class Main {

    public static abstract class Animal{
        public void makeSound(){
            System.out.println("Voice !!");
        }
        public void run(){
            System.out.println("faster");
        }
    }
public static class Dog extends Animal{
    @Override
    public void makeSound() {
        super.run();
        System.out.println("Woof");
    }
}
public static class Cat extends Animal{
    @Override
    public void makeSound() {
        super.run();
        System.out.println("Me-yy-y");
    }
}
public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
}
}

