package lesson22;

public  class Dog extends Main.Animal {
    @Override // анотация
    public void makeSound() {
        super.run();
        System.out.println("Woof");
    }
}
