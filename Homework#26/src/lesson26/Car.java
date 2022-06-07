package lesson26;


    class Car {

       String color;
       String brand;


       public Car setColor(String color) {
           this.color = color;
           return this;
       }

       public Car setBrand(String brand) {
           this.brand = brand;
           return this;
       }

       void showCar() {
           System.out.println(color + " " + brand);
       }

    public static void main (String[] args){

           Car car = new Car();
        car.setColor("red").setBrand("mazda").showCar();

    }
}
