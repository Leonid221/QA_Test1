package lesson22;

public class Main {

    public static abstract class Animal{
        public void makeSound(){
            System.out.println("Voice !!");
        }
        public void run(){
            System.out.println(" ");
        }
    }

    static void myMethod(Animal animal){
        animal.makeSound();
    }
public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

//        dog.makeSound();
//        cat.makeSound();
        myMethod(cat);
        myMethod(dog);
}
}

